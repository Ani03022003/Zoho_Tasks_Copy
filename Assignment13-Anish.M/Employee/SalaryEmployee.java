package Employee;

public class SalaryEmployee extends Employee{
    
    float totalSalary;
    static final int ctcBonusPercent=15;
    static final int monthlyProfessionalTax=1000;
    static final int monthlyPF=3000;


    SalaryEmployee(String name,String dept,int id,float pay){
        super(name, dept, id);
        this.totalSalary=pay;
    }

    public float calculatePay(){
        float deductions=(float)(totalSalary*(15/100.0))+monthlyProfessionalTax+monthlyPF;
        return totalSalary-deductions;
    }
}
