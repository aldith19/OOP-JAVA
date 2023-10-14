package ProgramLearnJava.application;

import ProgramLearnJava.data.Customer;
import ProgramLearnJava.data.Level;

public class EnumApp {

    public static void main(String[] args) {

        Customer customer= new Customer();
        customer.setName("Budi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDekskripsi());

        //konversi enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konversi string ke enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // untuk ambil semua enum yang ada
        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
