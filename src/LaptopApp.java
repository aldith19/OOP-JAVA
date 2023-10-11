public class LaptopApp {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Predator",17500000, "Processor AMD Ryzen 75000");
        laptop.brosur("Acer ");

        Lenovo lenovo = new Lenovo("IdelPad",7500000, "Processor Intel I3-12100F");
        lenovo.brosur("Lenovo ");

        Msi msi = new Msi("Cyborg",12500000, "Processor I5-12100F");
        msi.brosur("MSI ");


    }
}
