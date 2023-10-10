package ProgramLearnJava.data;

public class ProductApp {
    public static void main(String[] args) {

        Product produk = new Product("Lenovo",350000 );

        System.out.println(produk.name);
        System.out.println(produk.price);

        System.out.println(produk);


        Product produk2= new Product("Lenovo",350000 );
        System.out.println(produk.equals(produk2));
        System.out.println(produk.hashCode() == produk2.hashCode());

    }

}
