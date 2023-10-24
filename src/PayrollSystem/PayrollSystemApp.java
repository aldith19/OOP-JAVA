package PayrollSystem;

public class PayrollSystemApp {
    public static void main(String[] args) {
        PayrollSystem  payrollSystem = new PayrollSystem();
        FullTimeEmployee satu = new FullTimeEmployee("malik",1,3500000L);
        PartTime dua  = new PartTime("hendri",2,40,300);

        payrollSystem.addEmployee(satu);
        payrollSystem.addEmployee(dua);
        System.out.println("Detail Employee");
        payrollSystem.displayEmpoyee();
        System.out.println("Remmove Employee");
        payrollSystem.removeEmployee(2);
        System.out.println("Detail New Salary Employee");
        payrollSystem.displayEmpoyee();
    }
}
