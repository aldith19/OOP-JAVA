 class Parent {
    String name;

    void doit(){
        System.out.println("ini punya parent");
    }

}
 class Child extends Parent {
     String name;
     void doit(){
         System.out.println("ini punya child");
         System.out.println("parent " + super.name);
     }

 }