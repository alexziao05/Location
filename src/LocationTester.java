/**
 * Program 3 Part 1 A
 * Tests the Location class
 * CS160 - Section #3
 * @author Alex Huang
 */

public class LocationTester {
    public static void main(String[] args) {

        //Tests no arg constructor
        Location noArgLocation = new Location();
        System.out.println(noArgLocation.getLatitude());
        System.out.println(noArgLocation.getLongitude());
        noArgLocation.setLatitude(71);
        noArgLocation.setLongitude(151);
        System.out.println(noArgLocation.getLatitude());
        System.out.println(noArgLocation.getLongitude());

        //Tests two parameter constructor
        Location twoArgLocation = new Location (31, 150);
        System.out.println(twoArgLocation.getLatitude());
        System.out.println(twoArgLocation.getLongitude());
        twoArgLocation.setLatitude(71);
        twoArgLocation.setLongitude(151);
        System.out.println(twoArgLocation.getLatitude());
        System.out.println(twoArgLocation.getLongitude());

        Location loc1 = new Location(34.0522, -118.2437);
        Location loc2 = new Location(-22.9068, -43.1729);
        System.out.println(loc1.distanceFrom(loc2));

    }
}
