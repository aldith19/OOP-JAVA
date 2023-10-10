package ProgramLearnJava.application;

import ProgramLearnJava.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("JinxProAmanda321", "PoinBlck321");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("aldith"));
        System.out.println(new LoginRequest("aldith","1cak"));
    }
}
