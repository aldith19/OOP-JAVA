 class Ceo extends Manager {



     Ceo (String name){
         super(name);
     }



     void sayhello(String name){
         System.out.println("Hello "+ name + " My Name is Ceo " + this.name);
     }

}
