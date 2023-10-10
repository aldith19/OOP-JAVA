 class Parent {
    String name;

    void doit(){
        System.out.println("Do it parent");
    }

}


 class Child extends Parent {
     String name;

     void doit(){
         System.out.println("Do it child");
         System.out.println("Do it parent name " + super.name);
     }

 }