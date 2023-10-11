class Laptop {

    String name;
    Integer harga;
    String spek;

    Laptop(String name, Integer harga, String spek){
        this.name = name;
        this.harga = harga;
        this.spek = spek;
        }

    void brosur(String name){
        System.out.println( " Nama Produk " + name + this.name + " Harga " + this.harga + " " + this.spek );
    }


}
