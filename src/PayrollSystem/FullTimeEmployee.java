package PayrollSystem;

public class FullTimeEmployee extends Employee{

    private  double monthsalary;


    public FullTimeEmployee(String name, int id, double monthsalary) {
        super(name, id);
        this.monthsalary = monthsalary;
    }

    @Override
    public double caculateSalary() {
        return monthsalary;
    }
}
