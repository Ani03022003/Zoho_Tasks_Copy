import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextInt();
        double b=s.nextInt();
        double c=s.nextInt();
        double d=Math.pow(b, 2)-4*a*c;
        if(d==0){
            System.out.println("Equal roots");
            System.out.println(-b/(2*a));
        }
        else if(d>0){
            System.out.println("Two unequal real roots");
            System.out.println((-b+Math.pow(d, 0.5))/2.0*a+","+(-b-Math.pow(d, 0.5))/2.0*a);
        }
        else{
            System.out.println("Two non-real roots");
            System.out.print(-b/2*a+"+"+(Math.pow(-d,0.5))/2*a+"i"+",");
            System.out.print(-b/2*a+"-"+(Math.pow(-d,0.5))/2*a+"i");
        }
        s.close();
    }
}
