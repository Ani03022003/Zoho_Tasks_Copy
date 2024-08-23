import java.util.Scanner;

public class sumSeries {

    public static long genNum(int n){
        String num="";
        for(int i=1;i<=n;i++){
            num+="1";
        }
        return Long.parseLong(num);
    } 
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int n=s.nextInt();
        long sum=0;
        s.close();
        for(int i=1;i<=n;i++){
            sum+=genNum(i);
        }
        System.out.println("The Sum is: "+ sum);
    }
}
