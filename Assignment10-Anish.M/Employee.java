public class Employee {
    private String employeeName;
    private int employeeId;
    private String address;
    private String department;
    private float salaryPerMonth;

    Employee(String name,int id,String add,String dept,float salary){
        this.employeeName=name;
        this.employeeId=id;
        this.address=add;
        this.department=dept;
        this.salaryPerMonth=salary;
    }

    public void setEmployeeName(String name){
        this.employeeName=name;
    }

    public void setEmployeeId(int id){
        this.employeeId=id;
    }

    public void setAddress(String add){
        this.address=add;
    }

    public void setDepartment(String dept){
        this.department=dept;
    }

    public void setSalaryPerMonth(float salary){
        this.salaryPerMonth=salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getAddress(){
        return address;
    }

    public String getDepartment(){
        return department;
    }

    public float getSalaryPerMonth(){
        return salaryPerMonth;
    }

    public float getSalaryPerYear(){
        return salaryPerMonth*12;
    }
}

class EmployeeDemo{
    static Employee[] employees=new Employee[5];

    public static void displayEmployees(){
        for(int i=0;i<employees.length;i++){
            System.out.println("Employee Name: "+employees[i].getEmployeeName());
            System.out.println("Employee Id: "+employees[i].getEmployeeId());
            System.out.println("Address: "+employees[i].getAddress());
            System.out.println("Department: "+employees[i].getDepartment());
            System.out.println("Salary Per Month: "+employees[i].getSalaryPerMonth());
            System.out.println("Salary Per Year: "+employees[i].getSalaryPerYear());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        employees[0]=new Employee("Anish",101,"Plot no.D6 1st cross street Sri sai avenue","IT",60000.0f);
        employees[1]=new Employee("Priya", 102, "Veedu therium but pesurathu illa", "IT", 50000.0f);
        employees[2]=new Employee("Priyan", 103, "Some forest in goomidipoondi", "Maintenance Department", 55000.0f);
        employees[3]=new Employee("Vasu", 104, "Pune vadakan", "Production", 65000.0f);
        employees[4]=new Employee("Vignesh", 105, "Veeta vittu vela varamatan", "Audit", 70000.0f);
        displayEmployees();
    }
}
