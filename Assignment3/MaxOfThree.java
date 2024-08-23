package Assignment3;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first element: ");
        int a=s.nextInt();
        System.out.print("\nEnter second element: ");
        int b=s.nextInt();
        System.out.print("\nEnter third element: ");
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.print("\nMaximum is first element:"+a);
            }
            else{
                System.out.print("\nMaximum is third element:"+c);
            }
        }
        else{
            if(b>c){
                System.out.print("\nMaximum is second element:"+b);
            }
            else{
                System.out.print("\nMaximum is third element:"+c);
            }
        }
        s.close();
    }
}
