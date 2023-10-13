public class LaptopAppO {
    public static void main(String[] args) {
        // contoh inner and outer class

        Laptop laptopIn = new Laptop("");
        laptopIn.setName("Asus");

        Laptop.asus asus1 = laptopIn.new asus();
        asus1.setName("ROG Black");

        System.out.println(laptopIn.getName() +" "+ asus1.getName());
    }
}
