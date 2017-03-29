package com.Greg;

/**
 * Created by dadub on 3/7/2017.
 */
public class UsedCar {
    public static void main(String[] args) {


        for (int i = 1, x = 50000; i <= 8; i++, x = 50000 + i *3000){

            System.out.println("Oil change " + i + " scheduled at " + x + " miles.");

        }
    }
}
