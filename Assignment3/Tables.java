package Assignment3;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the multiplicand and the multiplier(Number of times need to be multiplied): ");
        int multiplicand=s.nextInt();
        int multiplier=s.nextInt();
        for(int i=1;i<=multiplier;i++){
            System.err.println(multiplicand+"x"+i+"="+multiplicand*i);
        }
        s.close();
    }
}
