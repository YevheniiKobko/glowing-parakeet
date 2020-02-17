package com.trade.delivery;

import java.util.ArrayList;

public class ListOfCars {
    public static void main(String[] args) {
        ArrayList<String> audiFactory = new ArrayList<>();
        // Adding car models to the list
        audiFactory.add("Audi A2");
        audiFactory.add("Audi A3");
        audiFactory.add("Audi A4");
        audiFactory.add("Audi A6");
        audiFactory.add("Audi RS7");
        audiFactory.add("Audi RS8");
        for(int i = 0; i < audiFactory.size(); i++){
            System.out.println(audiFactory.get(i));
        }
        // Change Audi A4 and Audi A6 to the sports version and output to the console only sports version
        audiFactory.set(2, "Audi RS4 8D");
        audiFactory.set(3, "Audi RS6 Sport");
        for(int i = 2; i < 6; i++){
            System.out.println(audiFactory.get(i));
        }
        // Delete from the list Audi RS8
        audiFactory.remove(5);
        // Separate primary versions from sports version
        audiFactory.add(2, "Sport version: ");
        for(int b =0; b < audiFactory.size(); b++){
            System.out.println(audiFactory.get(b));
        }
    }
}
