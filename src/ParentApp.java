public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Eko";
        child.doit();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doit();
        System.out.println(parent.name);
    }
}
