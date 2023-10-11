class Lenovo extends Laptop{

    Lenovo( String name, Integer harga, String spek){
        super(name,harga,spek);
    }

    void brosur(String name){
        System.out.println( " Nama produk " + name  + this.name + " Harga " + this.harga + " " + this.spek );
        System.out.println(" Untuk produk Lenovo sedang diskon ");
    }
}
