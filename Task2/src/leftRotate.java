//import java.util.*;
public class leftRotate {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        //Scanner s=new Scanner(System.in);
        //int k=s.nextInt();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
           // while((k--)!=0){
                for(int j=0;j<col-1;j++){
                    int temp=matrix[i][j+1];
                    matrix[i][j+1]=matrix[i][j];
                    matrix[i][j]=temp;
                }
            //}
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
