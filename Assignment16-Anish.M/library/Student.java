package library;

public class Student extends User{
    private String classOfStudent;

    public Student(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }
}
