import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        int count=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=n+"";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(""+count+((str.charAt(i)-48)));
                count=1;
            }
        }
        System.out.print(""+count+(str.charAt(str.length()-1)-48));
        s.close();
    }
}
