public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
        this.isBooked = false;
    }

    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket already booked by other person.");
        }
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.displayDetails();
        ticket.bookTicket("A10", 250.0);
        ticket.displayDetails();
        ticket.bookTicket("A11", 300.0);
    }
}
