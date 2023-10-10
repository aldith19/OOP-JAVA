package ProgramLearnJava.application;

import ProgramLearnJava.data.*;

public class Application {

    public static void main(String[] args) {

        String name = "Eko";

        Product produk = new Product("Laptop",350000);
        System.out.println(produk.name);
        System.out.println(produk.price);

        Data data = new Data();

    }
}
