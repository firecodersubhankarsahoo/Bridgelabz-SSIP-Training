import java.time.LocalTime;

public class TaxiService implements TransportService, GeoUtils {
    private final String id;
    private final LocalTime departure;
    private final double fare;
    private final double lat, lon;
    public TaxiService(String id, LocalTime departure, double fare, double lat, double lon) {
        this.id = id; this.departure = departure; this.fare = fare; this.lat = lat; this.lon = lon;
    }
    public String getId() { return id; }
    public String getType() { return "Taxi"; }
    public LocalTime getDeparture() { return departure; }
    public double getFare() { return fare; }
    public void startService() { System.out.println("Taxi " + id + " dispatched"); }
    public double distanceTo(double otherLat, double otherLon) {
        return GeoUtils.calculateDistance(lat, lon, otherLat, otherLon);
    }
}
