/**
 * Program 3 Part 1 A and Part 2
 * Getting locations and finding the distance from one location to another
 * CS160 - Section #3
 * @author Alex Huang
 */
public class Location {
    private final double EARTH_RADIUS_MILES = 3963.1676;
    private double latitude;
    private double longitude;

    public Location() {

    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setLatitude (double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude (){
        return latitude;
    }

    public void setLongitude (double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude () {
        return longitude;
    }

    public boolean equals (Location others) {
        double lat1 = this.latitude;
        double lon1 = this.longitude;
        double lat2 = others.latitude;
        double lon2 = others.longitude;

        double maxLat = Math.max(lat1, lat2);
        double minLat = Math.min(lat1, lat2);
        double maxLon = Math.max(lon1, lon2);
        double minLon = Math.min(lon1, lon2);

        double latitude_difference = maxLat - minLat;
        double longitude_difference = maxLon - minLon;

        return latitude_difference <= 0.0001 && longitude_difference <= 0.0001;
    }

    public String toString() {
        return "latitude:" + getLatitude() +
                ",longitude:" + getLongitude();
    }

    // Returns distance between this location and other location
    public double distanceFrom (Location other) {

        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);

        double lat2 = Math.toRadians(other.latitude);
        double lon2 = Math.toRadians(other.longitude);

        double cosC = Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lat1 - lat2);

        double arcLenC = Math.acos(cosC);
        return arcLenC * EARTH_RADIUS_MILES;
    }
}

