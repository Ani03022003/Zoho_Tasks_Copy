import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int k= 1;
        int row = 1;
        int maxWidth = n*2-1;

        while(k<=n) {
            int numElementsInRow = row;
            if (k + numElementsInRow - 1 > n) {
                numElementsInRow = n - k + 1;
            }
            int padding = (maxWidth - (numElementsInRow * 2 - 1)) / 2;
            for (int j = 0; j < padding; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numElementsInRow; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            row++;
        }
    }
}

