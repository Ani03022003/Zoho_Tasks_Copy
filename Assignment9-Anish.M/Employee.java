public class Employee {
    private String employeeName;
    private int employeeId;
    private String address;
    private String department;
    private float salaryPerMonth;
    private float salaryPerYear;

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
        return salaryPerYear*12;
    }
}
