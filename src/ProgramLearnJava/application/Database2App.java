package ProgramLearnJava.application;

import ProgramLearnJava.error.Database2;

public class Database2App {

    public static void main(String[] args) {

            connectDatabse2("aldith","komik");
            System.out.println("sukses");
    }

    public static void connectDatabse2(String username, String password){
        if (username == null || password == null){
            throw  new Database2("tidak bisa koneski ke dalam database");
        }
    }
}
