class Manager extends Employee {

   String company;

    Manager(String name, String company){
        super(name);
        this.company= company;
    }
    Manager(String name){
        super(name);
    }

    void sayhello(String name){
        System.out.println("Hello "+ name + " My Name is Manager " + this.name);
    }
}


