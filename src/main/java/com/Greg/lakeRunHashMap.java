package com.Greg;

import java.util.*;

public class lakeRunHashMap {

    //Use this scanner to read text data that will be stored in String variables
    static Scanner strScan = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numScan = new Scanner(System.in);

    public static void main(String[] args) {

        // Store data in a HashMap
        HashMap<String, ArrayList<Double>> lakeTimes = new HashMap<String, ArrayList<Double>>();

        boolean moreTimes = true;

        while (moreTimes) {

            System.out.println("What is the name of the lake?");
            String lake = strScan.nextLine();
            System.out.println("How long did this lake take you?");
            double time = numScan.nextDouble();

            addTime(lakeTimes, lake, time);

            System.out.println("Would you like to enter any additional times? ('y' or 'n')");
            moreTimes = strScan.nextLine().equalsIgnoreCase("y");

        }
        FastestTime(lakeTimes);
    }

    private static void FastestTime(HashMap<String, ArrayList<Double>> lakeTimes) {

        for (String lake : lakeTimes.keySet()) {
            ArrayList<Double> times = lakeTimes.get(lake);
            double fastest = Collections.min(times);
            System.out.println("The fastest time for " + lake + " was " + fastest);
        }
        strScan.close();   // Close scanners
        numScan.close();   // Close scanners
    }

    private static void addTime(HashMap<String, ArrayList<Double>> lakeTimes, String lake, double time) {

        if (lakeTimes.containsKey(lake)) {
            lakeTimes.get(lake).add(time);   // Add additional lap times

        } else{
            ArrayList<Double> times = new ArrayList();  // Create new array list
            times.add(time);    // Add new lap times
            lakeTimes.put(lake, times);
        }
    }
}