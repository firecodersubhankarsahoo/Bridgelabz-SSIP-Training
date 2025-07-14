class Ticket {
    String ticketId, customerName, movieName, seatNo, bookingTime;
    Ticket next;

    public Ticket(String ticketId, String customerName, String movieName, String seatNo, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.bookingTime = bookingTime;
    }
}

class TicketSystem {
    Ticket head = null;

    void addTicket(String id, String name, String movie, String seat, String time) {
        Ticket t = new Ticket(id, name, movie, seat, time);
        if (head == null) {
            head = t;
            t.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNo + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void countTickets() {
        int count = 0;
        if (head == null) return;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total Booked Tickets: " + count);
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.addTicket("T001", "Yash", "Inception", "A1", "6:30 PM");
        ts.addTicket("T002", "Riya", "Dune", "A2", "7:00 PM");
        ts.displayTickets();
        ts.countTickets();
    }
}
