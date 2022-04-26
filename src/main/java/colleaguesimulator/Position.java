package colleaguesimulator;

public class Position {
    private final double lat;
    private final double lng;

    public Position(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Position{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
