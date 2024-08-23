import java.util.Scanner;

public class isChar {
    public static boolean isCharFunction(char c){
        if((c>=65 && c<=90) || (c>=97 && c<=122))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.nextLine().charAt(0);
        if(isCharFunction(c))
            System.out.println("It is an Alphabet");
        else
            System.out.println("It is not an Alphabet");
        s.close();
    }
}
