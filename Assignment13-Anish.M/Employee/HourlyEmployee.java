package Employee;

public class HourlyEmployee extends Employee{
    
    float hoursWorkedPerDay;
    float payPerHour;
    int daysWorked;
    static final int totalHoursPerMonth=208;
    static final int bonusPerHour=1000;

    HourlyEmployee(String name,String dept,int id,float pay,float hoursWorked){
        super(name, dept, id);
        this.payPerHour=pay;
        this.hoursWorkedPerDay=hoursWorked;
    }

    public float calculatePay(){
        if((hoursWorkedPerDay*26)<208)
            return hoursWorkedPerDay*26*payPerHour;
        float bonusHours= (hoursWorkedPerDay*26)%totalHoursPerMonth;
        return 208*payPerHour+(bonusHours*bonusPerHour);
    }
}
