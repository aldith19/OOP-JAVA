package PayrollSystem;

public class PartTime  extends Employee{

    private  int housework;

    private  double hourRate;

   public PartTime(String name, int id, int housework, double hourRate){
       super(name,id);
       this.housework = housework;
       this.hourRate = hourRate;
   }



    @Override
    public double caculateSalary() {
        return housework * hourRate;
    }
}
