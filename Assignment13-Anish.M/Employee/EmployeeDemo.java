package Employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1=new HourlyEmployee("Anish","IT",1,500,8.5f);
        emp1.getEmployeeDetails();
        emp1=new SalaryEmployee("Priya","HR",2,50000);
        emp1.getEmployeeDetails();
    }
}
