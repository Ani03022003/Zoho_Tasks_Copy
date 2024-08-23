import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float celsius=s.nextFloat();
        float fahrenheit;
        fahrenheit=(celsius*(9.0f/5.0f))+32f;
        System.out.println(fahrenheit);
        s.close();
    }
}