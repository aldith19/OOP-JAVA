package ProgramLearnJava.application;

public class TraceApp {

    public static void main(String[] args) {

        try {
            error();
        } catch (RuntimeException run) {
             run.printStackTrace();
        }
    }
        public static void error() {
            try {
                String[] name = {"0", "1", "2", "3", "4", "5"};
                System.out.println(name[60]);
            } catch (Throwable sample) {
                throw new RuntimeException(sample);
            }
        }
    }
