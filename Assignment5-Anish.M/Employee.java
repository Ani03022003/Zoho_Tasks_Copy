public class Employee{
    String name;
    int employeeId;
    public String getEmployeeDetails(){
        return "Name: "+name+", EmployeeId: "+employeeId; 
    }
}
class HourlyEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
    public HourlyEmployee(String name,int id,double hourlyRate,double hoursWorked){
        this.name=name;
        this.employeeId=id;
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    
    public String getEmployeeDetails(){
        return "Name: "+name+", EmployeeId: "+employeeId+", Hour's workd: "+hoursWorked+", Hourly rate: "+hourlyRate+", Total amount: "+hourlyRate*hoursWorked; 
    }
}
class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(String name,int id,double salary){
        this.name=name;
        this.employeeId=id;
        this.salary=salary;
    }

    public String getEmployeeDetails(){
        return "Name: "+name+", EmployeeId: "+employeeId+", Salary: "+salary;
    }
}
class Main{
    public static void main(String[] args) {
        Employee emp1=new HourlyEmployee("Anish", 103, 102, 240);
        Employee emp2=new SalariedEmployee("Priya", 104, 30000.0);

        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
    }
}