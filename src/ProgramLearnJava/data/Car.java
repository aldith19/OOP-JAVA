package ProgramLearnJava.data;

public interface Car extends HashBrand, Maintance{

    void drive();

    int getTrire();

    default boolean isBig(){
        return false;
    }

}
