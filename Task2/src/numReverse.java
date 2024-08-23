import java.util.Scanner;

public class numReverse {

    public static int numRev(int num){
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev=(rev*10)+temp;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(numRev(num));
        s.close();
    }
}
