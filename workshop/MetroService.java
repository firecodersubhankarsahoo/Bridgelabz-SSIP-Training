import java.time.LocalTime;

public class MetroService implements TransportService {
    private final String id;
    private final LocalTime departure;
    private final double fare;
    public MetroService(String id, LocalTime departure, double fare) {
        this.id = id; this.departure = departure; this.fare = fare;
    }
    public String getId() { return id; }
    public String getType() { return "Metro"; }
    public LocalTime getDeparture() { return departure; }
    public double getFare() { return fare; }
    public void startService() { System.out.println("Metro " + id + " started"); }
}
