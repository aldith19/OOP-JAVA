package ProgramLearnJava.application;

import ProgramLearnJava.error.DatabaseError;

public class DatabaseApp {


    public static void main(String[] args){
    try{
        connectDatabase("aldith", null);
        System.out.println("sukses");
    }catch (DatabaseError error){
        System.out.println("Error"+ error.getMessage());
    }
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa koneksi ke databse");
        }
    }
}
