import java.util.Scanner;

public class SprialMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of the matrix: ");
        int n=s.nextInt();
        int[] matrixElements=new int[n*n];
        int[][] matrix=new int[n][n];
        System.out.println("Enter "+ n*n+" elements in the matrix: ");
        for(int i=0;i<n*n;i++){
            matrixElements[i]=s.nextInt();
        }
        System.out.println("The matrix in sprial order is: ");
        int colStart=0,colEnd=n-1,rowStart=0,rowEnd=n-1,k=0;
        while(colStart<=colEnd && rowStart<=rowEnd){
            for(int i=rowStart;i<=colEnd;i++){
                matrix[rowStart][i]=matrixElements[k++];
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                matrix[i][colEnd]=matrixElements[k++];
            }
            colEnd--;
            if(rowStart<=rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    matrix[rowEnd][i]=matrixElements[k++];
                }
                rowEnd--;
            }
            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    matrix[i][colStart]=matrixElements[k++];
                }
                colStart++;
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
