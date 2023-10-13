class Lenovo extends Laptop{

    Lenovo( String name, Integer harga, String spek){
        super(name,harga,spek);
    }
    Lenovo(String name){
        super(name);
    }

    void brosur(String name){
        System.out.println( " Nama produk B " + name  + this.name + " Harga " + this.harga + " " + this.spek );
        System.out.println(" Untuk produk Lenovo sedang diskon ");
    }




}
