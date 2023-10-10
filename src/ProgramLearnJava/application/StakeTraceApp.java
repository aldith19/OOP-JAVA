package ProgramLearnJava.application;

public class StakeTraceApp {

    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] name = {
                    "aldith", "reynaldi", "rangga", "putra"
            };
            System.out.println(name[100]);
        } catch ( Throwable throwable){
           throw new RuntimeException(throwable);

        }
    }
    }


