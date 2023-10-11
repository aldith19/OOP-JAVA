public class LaptopApp {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Predator",17500000, "Processor AMD Ryzen 75000");
        laptop.brosur("Acer ");

        Lenovo lenovo = new Lenovo("IdelPad",7500000, "Processor Intel I3-12100F");
        lenovo.brosur("Lenovo ");

        Msi msi = new Msi("Cyborg",12500000, "Processor I5-12100F");
        msi.brosur("MSI ");

        System.out.println("   ");
        /* Perubahan bentuk dalam Polymorphisme */

        Laptop laptop1 = new Laptop("Predator",17500000, "Processor AMD Ryzen 75000");
        laptop1.brosur("Acer ");

        laptop1 = new Lenovo("IdelPad",7500000, "Processor Intel I3-12100F");
        laptop1.brosur("Lenovo ");

        laptop1 = new Msi("Cyborg",12500000, "Processor I5-12100F");
        laptop1.brosur("MSI ");

        System.out.println(" ");

        brosur(new Laptop("Aspire"));
        brosur(new Lenovo("Yoga"));
        brosur(new Msi("Extreme"));

    }
     static void brosur( Laptop laptop){
         System.out.println("Nama Brand " + laptop.name);
    }
}
