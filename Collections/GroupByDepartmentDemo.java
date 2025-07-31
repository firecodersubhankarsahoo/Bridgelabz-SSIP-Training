import java.util.*;

class Employee {
    String name;
    String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String toString() { return name; }
}

public class GroupByDepartmentDemo {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee emp : employees) {
            map.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );
        Map<String, List<Employee>> grouped = groupByDepartment(employees);
        for (String dept : grouped.keySet()) {
            System.out.println(dept + ": " + grouped.get(dept));
        }
    }
}

