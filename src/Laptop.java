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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void brosur(String name){
        System.out.println( " Nama Produk A " + name + this.name + " Harga " + this.harga + " " + this.spek );
    }

    public class asus{
        String name;

        public String getName() {
            return name;
        }

        public String getLaptop(){
            return Laptop.this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
