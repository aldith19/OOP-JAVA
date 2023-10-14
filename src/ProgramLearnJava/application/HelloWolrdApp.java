package ProgramLearnJava.application;

import ProgramLearnJava.data.HelloWorld;

public class HelloWolrdApp {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayhello() {
                System.out.println("hello");
            }

            @Override
            public void sayhello(String Name) {

                System.out.println("hello " + Name);
            }
        };

        helloWorld.sayhello("ki");

    }
}
