import java.util.Scanner;

public class printC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
