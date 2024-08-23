public class expression2 {
    public static void main(String[] args) {
        int a=10;
        a+=a++ + ++a + --a + a-- + a++; //Executes from left to right 28+30+29+29=+28;
        System.out.println(a); // 10+12+11+11+10=+10
    }
}
