import java.util.Scanner;

class Login{
    static String username;
    static String password;
    static{
        username="Anish";
        password="Toshi@123";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your username: ");
        String name=s.nextLine();
        System.out.print("Enter password: ");
        String pass=s.nextLine();
        if(!name.equals(username))
            System.out.println("Invalid username");
        else if(!pass.equals(password))
            System.out.println("Wrong password");
        else
            System.out.println("Successfully Loged-in");
        s.close();
    }
}