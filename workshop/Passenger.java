public class Passenger {
    private final String name;
    private final String route;
    private final double farePaid;
    private final boolean peak;
    public Passenger(String name, String route, double farePaid, boolean peak) {
        this.name = name; this.route = route; this.farePaid = farePaid; this.peak = peak;
    }
    public String getName() { return name; }
    public String getRoute() { return route; }
    public double getFarePaid() { return farePaid; }
    public boolean isPeak() { return peak; }
    public String toString() { return name + "(" + route + "," + farePaid + "," + (peak?"peak":"off") + ")"; }
}
