import java.time.LocalTime;
import java.util.List;

public interface TransportService {
    String getId();
    String getType();
    LocalTime getDeparture();
    double getFare();
    default void printServiceDetails() {
        System.out.println(getType() + " [" + getId() + "] departs at " + getDeparture() + " fare=" + getFare());
    }
    void startService();
}
