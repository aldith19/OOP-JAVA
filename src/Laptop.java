class Laptop {

    String name;
    Integer harga;
    String spek;

    Laptop(String name, Integer harga, String spek){
        this.name = name;
        this.harga = harga;
        this.spek = spek;
        }

    Laptop(String name){
        this(name,null,null);
    }

    void brosur(String name){
        System.out.println( " Nama Produk A " + name + this.name + " Harga " + this.harga + " " + this.spek );
    }


}
