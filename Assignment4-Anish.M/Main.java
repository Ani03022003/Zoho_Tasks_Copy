public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Anish");
        Person p2=new Person("Priya", 21);
        Person p3=new Person("Thoshi",2,"Plot no.D6, 1st cross street, Sri sai avenue,Puthur mappedu");
        System.out.println("Name in p1: "+p1.name);
        System.out.println("Name in p2: "+p2.name+", Age in p2: "+p2.age);
        System.out.println("Name in p3: "+p3.name+", Age in p3: "+p3.age+", Address in p3: "+p3.address);
    }
}
