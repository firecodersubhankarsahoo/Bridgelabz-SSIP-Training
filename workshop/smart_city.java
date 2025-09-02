import java.util.*;
import java.util.stream.*;

interface TransportService {
    String getName();
    double getFare();
    String getRoute();
    default void printServiceDetails() {
        System.out.println(getName() + " | " + getRoute() + " | Fare: " + getFare());
    }
    static double calculateDistance(String from, String to) {
        if(from=="valid"||)
        return new Random().nextInt(20) + 1;

    }
}


@FunctionalInterface
interface FareCalculator {
    double calculateFare(double distance);
}

interface EmergencyService {}

class Bus implements TransportService {
    public String getName(){ return "Bus"; }
    public double getFare(){ return 15; }
    public String getRoute(){ return "A-B"; }
}
class Metro implements TransportService {
    public String getName(){ return "Metro"; }
    public double getFare(){ return 30; }
    public String getRoute(){ return "B-C"; }
}
class Taxi implements TransportService {
    public String getName(){ return "Taxi"; }
    public double getFare(){ return 50; }
    public String getRoute(){ return "A-C"; }
}
class Ambulance implements TransportService, EmergencyService {
    public String getName(){ return "Ambulance"; }
    public double getFare(){ return 0; }
    public String getRoute(){ return "Any"; }
}

public class smart_city {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TransportService> services = Arrays.asList(new Bus(), new Metro(), new Taxi(), new Ambulance());

        services.stream()
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        Map<String,List<TransportService>> byRoute = services.stream()
                .collect(Collectors.groupingBy(TransportService::getRoute));
        System.out.println("Routes: " + byRoute.keySet());

        DoubleSummaryStatistics stats = services.stream()
                .collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("Total Fare=" + stats.getSum() + " | Avg=" + stats.getAverage());

        System.out.println("Dashboard:");
        services.forEach(s -> System.out.println("Active: " + s.getName()));

        FareCalculator calc = d -> d * 2;
        System.out.println("Taxi Fare (10km): " + calc.calculateFare(10));

        services.stream().filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("Emergency Priority: " + s.getName()));

    }
}
