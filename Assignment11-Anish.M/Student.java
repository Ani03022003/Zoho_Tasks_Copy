@SuppressWarnings("unused")
public class Student {
    private String name;
    private int rollno;
    
    Student(){
    }

    Student(String name){
        this.name=name;
    }

    Student(int rollno){
        this.rollno=rollno;
    }

    Student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}

class ZSGSStudent extends Student{
    ZSGSStudent(String name){
        super(name);
    }
    ZSGSStudent(int rollno){
        super(rollno);
    }
    ZSGSStudent(String name,int rollno){
        super(name,rollno);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Student student1=new ZSGSStudent("Anish", 123);
        @SuppressWarnings("unused")
        Student student2=new ZSGSStudent("Priya");
    }
}
