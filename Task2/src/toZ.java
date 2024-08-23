import java.util.*;

public class toZ {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.nextLine().charAt(0);
        for(int i=(int)c;i<=(int)'z';i++){
            System.out.print((char)i);
        }
        s.close();
    }
}
