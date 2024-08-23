import java.util.Scanner;

public class xPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row=s.nextInt();
        s.close();
        for(int i=1;i<=row;i++){
            int num=1;
            for(int j=1;j<=row;j++){
                if(j==i || i+j-1==row){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
