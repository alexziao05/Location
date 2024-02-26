/**
 * Program 3 Part 2
 * Has-a Location class; Location name and description
 * CS160 - Section #3
 * @author Alex Huang
 */
public class Place {
    private String name;
    private String description;
    private Location location;

    public Place() {

    }

    public Place(String name, String desc, double latitude, double longitude) {
        this.name = name;
        description = desc;
        this.location = new Location(latitude, longitude);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }

    public void setLocation(double latitude, double longitude) {
        this.location = new Location(latitude, longitude);
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + "," + description +
                ",latitude:" + location.getLatitude() +
                ",longitude:" + location.getLongitude();
    }

    public String getID() {
        return "Program 3b, Alex Huang";
    }
}
