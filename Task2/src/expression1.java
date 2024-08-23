public class expression1 {
    public static void main(String[] args) {
    //i)
        int a=10;
        int b=20;
        System.out.println(++a-b--); // 11-20;
    //ii)
        a=10;
        b=5;
        System.out.println(a%b++); // (10%5) first increment appens then mod but here it is postfix so increment won't happen in this step;
        
    //iii)
        a=10;
        b=20;
        a*=b+5;
        System.out.println(a); // 20+5=>10*25=>250 Assignment operator has less precedence than addition operator;

        //iv)
        int x=128>>>2;
        System.out.println(x);
    }
}
