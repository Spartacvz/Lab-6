import java.io.BufferedReader;
import java.io.FileReader;

public class MCTCElevation {

    public static void main(String[] args) {

        String key = null;
        // Read key from file
        try(BufferedReader reader = new BufferedReader(new FileReader("key.txt")))  {
            key = reader.readLine();
            System.out.println(key);
        }catch (Exception ioe)  {
            System.out.println("No key file found, or coul not read key. Please verify key.txt present");
            System.exit(-1);    // Quit program - need to fix before continuing.
        }
        // TODO Use Maps API to get MCTC's elevation

        // Create a context - this authenticates you to Google using your key and verifies which map services you are allowed to use
        // Do this one time at the start of your code, once you've read your key
        GeoApiContext context = new GeoApiContext().setApiKey(key);

        // According to the ElevationAPI docs, to get the elevation of a particular point, you need to know it's latitude and longitude
        // I looked up the lat and long of MCTC
        // Which are 44.973074, -93.283356
        // Coulld have also used another Google service to look up the lat and long of a place... that will be your job in lab

        // Create a Lanlng object, to reperesent a point on the earth by latitude and longitude
        // We'll use ElevationAPI to request the elevation of this LatLng.
        LatLng mctcLng = new LatLng(44.973074, -93.286656);

        // Use ElevationApi class to request Elevation data
        // The await() method makes your code pause and wait for the results to come back - a synchronous method call
        // Can also use these methods asynchronously - your code keeps running while waiting for results to come back, can multitask.
        // Advanced reading... asynce vs. synchronous calls - we'll keep it simple and use synchronous
        ElevationResult mctcElevation = results[0];
        System.out.println("The elevation of MCTC above sea level is " + mctcElevation.elevation + " meters");
        // Let's do some rounding
        System.out.println(String.format("The elevation of MCTC above sea level is %.2f meters.", mctcElevation.elevation));
    }
}