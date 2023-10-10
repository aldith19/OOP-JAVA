package ProgramLearnJava.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Jenis Bis");
    }

    public int getTrire() {
        return 8;
    }

    public boolean isBig() {
        return true;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintance() {
        return false;
    }
}
