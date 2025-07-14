class Process {
    String pid;
    int burst, priority;
    Process next;

    public Process(String pid, int burst, int priority) {
        this.pid = pid;
        this.burst = burst;
        this.priority = priority;
    }
}

class Scheduler {
    Process head = null;

    void addProcess(String pid, int burst, int priority) {
        Process p = new Process(pid, burst, priority);
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    void simulate(int quantum) {
        Process temp = head;
        while (temp != null && temp.next != temp) {
            if (temp.burst > quantum) {
                System.out.println(temp.pid + " executed for " + quantum);
                temp.burst -= quantum;
            } else {
                System.out.println(temp.pid + " completed in " + temp.burst);
                remove(temp.pid);
            }
            temp = temp.next;
        }
        if (temp != null) System.out.println(temp.pid + " completed");
    }

    void remove(String pid) {
        if (head == null) return;
        Process curr = head, prev = null;
        do {
            if (curr.pid.equals(pid)) {
                if (curr == head) {
                    Process tail = head;
                    while (tail.next != head) tail = tail.next;
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}

public class RoundRobinScheduler {
    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        s.addProcess("P1", 10, 1);
        s.addProcess("P2", 5, 2);
        s.addProcess("P3", 8, 1);
        s.simulate(4);
    }
}
