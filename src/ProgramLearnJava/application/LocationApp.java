package ProgramLearnJava.application;

import ProgramLearnJava.data.City;
import ProgramLearnJava.data.Location;

public class LocationApp {

    public static void main(String[] args) {
        //var location = new Location(); // error

        // ini bisa. Location location = new City(); //

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
