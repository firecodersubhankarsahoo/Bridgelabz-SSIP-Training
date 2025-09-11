@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double baseFare, double distanceKm);
    static FareCalculator defaultCalc() { return (b,d) -> b + d * 0.5; }
}
