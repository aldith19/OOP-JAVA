public class PolymorphismeApp {

    public static void main(String[] args) {

        Employee employee = new Employee("eko");
        employee.sayhello("budi");

        employee = new Manager("sadi");
        employee.sayhello("udin");

        employee = new Ceo("adis");
        employee.sayhello("kira");


        sayHello(new Employee("Eko"));
        sayHello(new Ceo("Dimas"));
        sayHello(new Manager("Mastah"));
    }

    static void sayHello(Employee employee){
         if (employee instanceof Ceo){
             Ceo ceo = (Ceo) employee;
             System.out.println("Hello ceo " + ceo.name);
         } else if ( employee instanceof Manager) {
             Manager manager= (Manager) employee;
             System.out.println("Hello manager " + manager.name);
         } else {
             System.out.println("Hello " + employee.name);
         }
    }
}
