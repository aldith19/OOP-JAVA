package ProgramLearnJava.application;


import ProgramLearnJava.data.Car;
import ProgramLearnJava.data.Rush;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Rush();
        System.out.println(car.getTrire());
        car.drive();
    }
}
