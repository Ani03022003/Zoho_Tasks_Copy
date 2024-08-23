import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of the matrix: ");
        int n=s.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("Transpose of the given matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
