
abstract class Employee{
	 private String employeeId;
	 private String name;
	 private double baseSalary;
	Employee(String id,String name,double Salary){
		this.employeeId=id;
		this.name=name;
		setBaseSalary(Salary);
	}
	
	public void setBaseSalary(double Salary) {
		if(Salary>=0) {
			this.baseSalary=Salary;
		}else {
			System.out.println("Salary cannot be negative");
		}
	}
	public abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Base Salary: "+getBaseSalary());		
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	protected abstract void assignDepartment(String dept);
	
}


interface department{
	void assignDepartment(String dept);
	String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements department{
	private String department;
	FullTimeEmployee(String id, String name, double Salary) {
		super(id, name, Salary);
	}

	@Override
	public double calculateSalary() {
		return super.getBaseSalary()*1.2;
	}

	@Override
	public void assignDepartment(String dept) {
		this.department=dept;
		
	}

	@Override
	public String getDepartmentDetails() {
		return department;
	}
	
}
class PartTimeEmployee extends Employee implements department{
	private int hours;
	private String department;
	PartTimeEmployee(String id,String name,double hourlyRate,int hours){
		super(id,name,hourlyRate);
		this.hours=hours;
		
	}
	@Override
	public void assignDepartment(String dept) {
		this.department=dept;
	}
	@Override
	public String getDepartmentDetails() {
		return department;
	}
	@Override
	public double calculateSalary() {
		return super.getBaseSalary()*hours;
	}
}
public class Employee_Management_System {
	public static void main(String []args) {
		Employee e1=new FullTimeEmployee("22150","Yash",100000);
		Employee e2=new PartTimeEmployee("22151","Prashant",10000,2);
//		department d1=(department) e1;
//		department d2=(department) e2;
		e1.assignDepartment("HR");
		e2.assignDepartment("Security");
		Employee []emp= {e1,e2};
		for(Employee e:emp) {
			e.displayDetails();
			System.out.println(((department)e).getDepartmentDetails());
		}
	}
}
