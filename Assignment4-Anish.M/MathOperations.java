public class MathOperations {
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static float sub(float a,float b){
        return a-b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static float mul(float a,float b){
        return a*b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static float div(float a,float b){
        return a/b;
    }
    public static double div(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(add(2.5, 5.5));
        System.out.println(add(2.5f, 5.5f));
        System.out.println(sub(2, 5));
        System.out.println(sub(2.5, 5.5));
        System.out.println(sub(2.5f, 5.5f));
        System.out.println(mul(2, 5));
        System.out.println(mul(2.5, 5.5));
        System.out.println(mul(2.5f, 5.5f));
        System.out.println(div(2, 5));
        System.out.println(div(10.0, 3.0));
        System.out.println(div(10f, 3f));
    }
}
