import java.util.Scanner;

public class symmentryPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        s.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(i+j>=row){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int j=0;j<row;j++){
                if(j<i){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=1;i<row;i++){
            for(int j=0;j<row;j++){
                if(j>i){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int j=0;j<row;j++){
                if(i+j<row-1){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
