package ProgramLearnJava.application;

import ProgramLearnJava.annotation.Fancy;
import ProgramLearnJava.data.Animal;
import ProgramLearnJava.data.Cat;
import ProgramLearnJava.data.Paus;


@Fancy(name = "animalapp", tags = {"aplikasi","java"})
public class AnimalApp {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Tiger";
        animal.jenis = "Mamalia";
        animal.run();

        animal = new Paus();
        animal.name= "Paus";
        animal.jenis= "Mamalia";
        animal.run();
    }
}
