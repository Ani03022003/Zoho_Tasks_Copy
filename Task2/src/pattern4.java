import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        s.close();
        int k=rows;
        for(int i=1;i<=rows;i++){
            for(int j=1; j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(k+" ");
            }
            k--;
            System.out.println();
        }
    }
}
