package ProgramLearnJava.application;

import ProgramLearnJava.data.LoginRequest;
import ProgramLearnJava.error.ValidationException2;
import ProgramLearnJava.util.ValidationUtlil2;

public class ValidApp {

    public static void main(String[] args) {

        LoginRequest loginRequest1 = new LoginRequest(null,null);

        try {
            ValidationUtlil2.validate2(loginRequest1);
            System.out.println("Data valid");
        }catch (ValidationException2 | NullPointerException data){
            System.out.println("Data Tidak Valid: " + data.getMessage());
        } finally {
            System.out.println("selalu eksekusi baik benar dan salah");
        }


        LoginRequest loginRequest = new LoginRequest(null,null);
        ValidationUtlil2.validateruntime2(loginRequest);
        System.out.println("sukses");
    }
}
