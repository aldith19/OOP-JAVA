package ProgramLearnJava.data;

public class SocialMedia {
    String name;


}

final class facebook extends SocialMedia{
    final void login(String username, String password){
        //Isi Method
    }
}

/* Disaat diberikan fungsi final pada class, maka class tidak bisa ditutunkan lagi  */
// class fakeFacebook extends facebook {
    // void login ( String name, String pasword){
    // isi method
    /* Disaat diberikan fungsi final pada method, maka sebuah method tidak bisa di overide lagi */
// }
// Error }

