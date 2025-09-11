import java.time.LocalTime;

public class BusService implements TransportService {
    private final String id;
    private final LocalTime departure;
    private final double fare;
    public BusService(String id, LocalTime departure, double fare) {
        this.id = id; this.departure = departure; this.fare = fare;
    }
    public String getId() { return id; }
    public String getType() { return "Bus"; }
    public LocalTime getDeparture() { return departure; }
    public double getFare() { return fare; }
    public void startService() { System.out.println("Bus " + id + " started"); }
}
