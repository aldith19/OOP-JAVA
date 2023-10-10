package ProgramLearnJava.application;

import ProgramLearnJava.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Belajar Java");

        Company.Employee employee = company.new Employee();
        employee.setName("Aldith");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());


        Company company1 = new Company();
        company1.setName("Belajar javascript");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Aldith Reynaldi");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}