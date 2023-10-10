package ProgramLearnJava.util;

import ProgramLearnJava.annotation.NotBlank;
import ProgramLearnJava.data.LoginRequest;
import ProgramLearnJava.error.BlankExeption;
import ProgramLearnJava.error.VallidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws VallidationException, NullPointerException {
        if (loginRequest.username() == null){
            throw  new VallidationException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw  new NullPointerException("Username is kosong");
        } else if (loginRequest.password() == null ) {
            throw  new VallidationException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new NullPointerException("Password is kosong");
        }
    }


    public static void validateRuntime (LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw  new BlankExeption("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw  new NullPointerException("Username is kosong");
        } else if (loginRequest.password() == null ) {
            throw  new BlankExeption("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new NullPointerException("Password is kosong");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try {
                    String value = (String) field.get(object);
                    if ( value == null || value.isBlank()){
                        throw new BlankExeption("Field " + field.getName()+" is Blank");
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa akses fielad "+ field.getName());
                }

            }
        }
    }
}
