class Msi extends Laptop {

    Msi(String name, Integer harga, String spek){
        super(name,harga,spek);
    }
    Msi(String name){
        super(name);
    }
    void brosur(String name){
        System.out.println( " Nama produk C " + name + this.name + " Harga " + this.harga + " " + this.spek );
    }
}
