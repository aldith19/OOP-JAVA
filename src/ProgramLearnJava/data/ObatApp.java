package ProgramLearnJava.data;

public class ObatApp {
    public static void main(String[] args) {

        Obat obat = new Obat("Paracetamol",35000,"35");
        System.out.println(obat.name);
        System.out.println(obat.price);
        System.out.println(obat);


        Obat obat2  = new Obat("Paracetamol",35000,"35");
        System.out.println(obat.equals(obat2));
        System.out.println(obat.hashCode() == obat2.hashCode());
    }
}
