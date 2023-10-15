package ProgramLearnJava.util;

import ProgramLearnJava.data.LoginRequest;
import ProgramLearnJava.error.BlankExeption2;
import ProgramLearnJava.error.ValidationException2;

public class ValidationUtlil2 {

    public static void validate2(LoginRequest loginRequest2) throws ValidationException2, NullPointerException{
        if (loginRequest2.username() == null ){
            throw new ValidationException2("Username2 null");
        }else if (loginRequest2.username().isBlank()){
            throw new NullPointerException("Username2 kosong");
        } else if (loginRequest2.password() == null) {
            throw  new ValidationException2("Password2 null");
        } else if (loginRequest2.password().isBlank()) {
            throw new NullPointerException("Password2 Kosong");
        }
    }


    public static void validateruntime2(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new BlankExeption2("usernaem null");
        } else if ( loginRequest.username().isBlank()) {
            throw new NullPointerException("username kosong");
        } else if (loginRequest.password() == null)    {
            throw new BlankExeption2("Password null");
        } else if (loginRequest.password().isBlank())  {
            throw  new NullPointerException("Password kosong");
        }
    }
    }



