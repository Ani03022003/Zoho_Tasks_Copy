import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(); //10
        int b=s.nextInt(); //2
        System.out.println(a&b); //1010 & 0010 -> 0010(2)
        System.out.println(a|b); //1010 | 0010 -> 1010(10)
        System.out.println(a^b); //1010 ^ 0010 -> 1000(8)
        System.out.println(a>>b); //1010 >> 2 -> 0010(2)
        System.out.println(a<<b); //1010 << 2 -> 0010 1000(40)
        System.out.println(a>>>b); //1010 >>> 2 -> 0010(2)
        s.close();
    }
}
