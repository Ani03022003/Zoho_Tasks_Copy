import java.util.Scanner;

public class charASCII {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char c=s.nextLine().charAt(0);
        System.out.println((int)c);
        s.close();
    }
}
