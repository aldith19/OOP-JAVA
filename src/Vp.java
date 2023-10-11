class Vp extends Manager {

    Vp (String name, String company){
        super(name,company);
    }



    @Override
    void sayhello(String name) {
        System.out.println("Hello "+name+ " My name is Vp " + this.name + " Dari PT " + company);
    }
}
