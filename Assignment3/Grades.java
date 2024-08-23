package Assignment3;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks=s.nextInt();
        if(marks>=90 && marks<=100)
            System.out.println("\n\"O\" Grade ");
        else if(marks>=80 && marks<90)
            System.out.println("\n\"A+\" Grade ");
        else if(marks>=70 && marks<80)
            System.out.println("\n\"A\" Grade ");
        else if(marks>=60 && marks<70)
            System.out.println("\n\"B+\" Grade ");
        else if(marks>=50 && marks<60)
            System.out.println("\n\"A+\" Grade ");
        else
            System.out.println("\n\"F\" Grade ");        
        s.close();
    }
}
