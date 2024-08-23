import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=rows-i+1;j<=rows;j++){
                System.out.print(j+" ");
            }
            for(int j=rows-1;j>rows-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
