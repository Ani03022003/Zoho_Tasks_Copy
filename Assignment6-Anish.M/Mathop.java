public class Mathop {
    static double pi;
    static double e;
    static double g;
    static{
        pi=3.14;
        e=2.718281828459045235360;
        g=10;
    }

    public static void main(String[] args) {
        System.out.println("Area of a circle = "+pi*10*10);
        System.out.println("Money after 4 years compounded 4% continuously with principal amount $850 = "+ 850*Math.pow(e, 0.04*4));
        System.out.println("Force of a stone of 987kg at freefall = " + 987*g +"N");
    }
}
