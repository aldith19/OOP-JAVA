package ProgramLearnJava.application;

import static ProgramLearnJava.data.Application.*;
import static ProgramLearnJava.data.Constant.*;
import ProgramLearnJava.data.Country;
import ProgramLearnJava.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.city city = new Country.city();
        city.setName("Lampung");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);

    }
}
