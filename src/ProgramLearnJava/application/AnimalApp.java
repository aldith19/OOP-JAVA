package ProgramLearnJava.application;

import ProgramLearnJava.annotation.Fancy;
import ProgramLearnJava.data.Animal;
import ProgramLearnJava.data.Cat;


@Fancy(name = "animalapp", tags = {"aplikasi","java"})
public class AnimalApp {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "tiger";
        animal.run();
    }
}
