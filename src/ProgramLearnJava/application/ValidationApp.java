package ProgramLearnJava.application;

import ProgramLearnJava.data.LoginRequest;
import ProgramLearnJava.error.VallidationException;
import ProgramLearnJava.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("eko","1cak");
        /* blok Try catch untuk menangkap error, Bisa pake ini | buat error excepion secara banyak */
        /* Final keyword blok untuk dimana selalu eksekusi baik terjadi exception atau tidak, mau itu sukses atau gagal */
        try{
        ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (VallidationException  | NullPointerException exception){
            System.out.println("Data Tidak Valid: " + exception.getMessage());
        }finally {
            System.out.println("selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("",null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("sukses");
}
}
/*      Bisa pake ini buat multiple error
        try{
        ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (VallidationException  | NullPointerException exception){
            System.out.println("Data Tidak Valid: " + exception.getMessage());

        }catch (NullPointerException exception){
            System.out.println("Data Kosong: " + exception.getMessage() );
        }
        */