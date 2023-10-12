package ProgramLearnJava.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bis");
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

    @Override
    public String getcolor() {
        return "merah";
    }

    public boolean isMaintance() {
        return false;
    }
}
