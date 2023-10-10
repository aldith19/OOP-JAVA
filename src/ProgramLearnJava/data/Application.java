package ProgramLearnJava.data;

public class Application {

    public static final int PROCESSOR;

    static {
        System.out.println("mengakses class Aplication");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
