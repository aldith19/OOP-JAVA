public class PersonApp {
    public static void main(String[] args) {

        var person = new Person("Udin","Subang");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        person.sayhello("Bedu");


        Person person2 = new Person("adi");
        person2.address = "Jakarta";
        person2.sayhello("Gani");

        Person person3;
        person3 = new Person();
        person3.name = "malih";
        person3.address = "Depok";
        person3.sayhello("Rudi");

    }
}
