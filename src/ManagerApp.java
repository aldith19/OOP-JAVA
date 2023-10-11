public class ManagerApp {

    public static void main(String[] args) {

        var manager = new Manager("Eko");
        manager.sayhello("budi");

        var ceo = new Ceo("Aldith");
        ceo.sayhello("budi");

        var employee = new  Employee("Reynaldi");
        employee.sayhello("budi");

        var vp = new Vp("aldith reynaldi","Bukit Asam");
        vp.sayhello("kardi");

    }
}
