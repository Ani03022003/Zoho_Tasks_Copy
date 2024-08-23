import java.util.Scanner;

public class quadraticEquation {
    public static double[] evaluate(int a, int b,int c){
        double d=b*b-(4*a*c);
        if(d==0){
            double x=(-b/(2*a));
            return new double[]{x}; 
        }
        else if(d>0){
            double x= (-b+Math.pow(d, 0.5))/(2*a);
            double y= (1-b-Math.pow(d, 0.5))/(2*a);
            return new double[]{x,y};
        }
        else{
            return new double[]{};
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double root[]=evaluate(a,b,c);
        if(root.length==1){
            System.out.print("1 real root: "+ root[0]);
        }
        if(root.length==2){
            System.out.print("2 real roots: "+ root[0]+", "+root[1]);
        }
        if(root.length==0){
            System.out.println("NO real Roots.");
        }
        s.close();
    }
}
