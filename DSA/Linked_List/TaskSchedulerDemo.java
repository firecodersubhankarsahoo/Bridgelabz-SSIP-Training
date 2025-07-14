class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null;

    void addLast(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = t;
            t.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void viewTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addLast(1, "Task1", 1, "2025-07-14");
        ts.addLast(2, "Task2", 2, "2025-07-15");
        ts.viewTasks();
    }
}
