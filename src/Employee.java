class Employee {

    String name;

    Employee(String name){
        this.name = name;
    }
    void sayhello(String name){
        System.out.println("Hello "+ name + " My Name is Employee " + this.name);
    }
}
