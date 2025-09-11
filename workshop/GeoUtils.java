public interface GeoUtils {
    static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double dx = lat1 - lat2;
        double dy = lon1 - lon2;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
