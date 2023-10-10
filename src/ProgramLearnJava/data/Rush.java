package ProgramLearnJava.data;

public class Rush implements Car{

    public void drive() {
        System.out.println("Mobilku");
    }

    public int getTrire() {
        return 4;
    }

    public String getBrand() {
        return "toyota";
    }

    public boolean isMaintance() {
        return false;
    }
}
