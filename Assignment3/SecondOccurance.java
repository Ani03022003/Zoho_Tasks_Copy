package Assignment3;

import java.util.Scanner;

public class SecondOccurance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements and enter the elements of the array: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the element you want o check for the second occurance: ");
        int element=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element)
                count++;
            if(count==2){
                System.out.println("The second occurance of the element "+element+" is at "+(i+1)+" position.");
                break;
            }
        }
        if(count<2){
            System.out.println("There is no second occurance of the element");
        }
        s.close();
    }
}
