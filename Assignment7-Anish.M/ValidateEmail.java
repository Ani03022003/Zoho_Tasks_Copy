import java.util.Scanner;

public class ValidateEmail {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter E-mail you want to validate: ");
        String email=s.nextLine();
        if(isValid(email))
            System.out.println("Valid");
        else
            System.out.println("Not valid");
        s.close();
    }

    public static boolean isValid(String str){
        if(str.indexOf('@')==-1 || str.indexOf('.')==-1)
            return false;
        if(str.charAt(0)=='@' || str.charAt(str.length()-1)=='@')
            return false;
        if(str.charAt(0)=='.' || str.charAt(str.length()-1)=='.')
            return false;
        if(str.charAt(str.indexOf('@')-1)=='.' || str.charAt(str.indexOf('@')+1)=='.')
            return false;
        return true;
    }
}
