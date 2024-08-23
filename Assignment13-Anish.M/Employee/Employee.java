package Employee;

abstract public class Employee{
    private String employeeName;
    private String department;
    private int employeeId;

    Employee(String name,String dept,int id){
        this.employeeName=name;
        this.department=dept;
        this.employeeId=id;
    }

    abstract float calculatePay();

    String getName(){
        return this.employeeName;
    }

    String getDepartment(){
        return this.department;
    }

    int getEmployeeId(){
        return this.employeeId;
    }

    public void getEmployeeDetails(){
        System.out.println("Name: "+getName()+"\nDepartment: "+department+"\nEmployee Id: "+employeeId+"\nPay: "+calculatePay());
    }
}