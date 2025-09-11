import java.time.LocalTime;

public class AmbulanceService implements TransportService, EmergencyService {
    private final String id;
    private final LocalTime departure;
    private final double fare;
    public AmbulanceService(String id, LocalTime departure) {
        this.id = id; this.departure = departure; this.fare = 0.0;
    }
    public String getId() { return id; }
    public String getType() { return "Ambulance"; }
    public LocalTime getDeparture() { return departure; }
    public double getFare() { return fare; }
    public void startService() { System.out.println("Ambulance " + id + " on emergency run"); }
}
