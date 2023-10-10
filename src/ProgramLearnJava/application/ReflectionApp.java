package ProgramLearnJava.application;

import ProgramLearnJava.data.CreateUserRequest;
import ProgramLearnJava.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("eko");
        request.setPassword("lusa");
        request.setName("kiu");
        ValidationUtil.validationReflection(request);
    }
}
