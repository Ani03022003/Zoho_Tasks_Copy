public class Question2 {
    public static void main(String[] args) {
        int num1=124;
        int num2=44;
        int base=5;

        int carry=0;
        int sum=0;
        String ans="";
        while(num1!=0 || num2!=0){
            int a=num1%10;
            int b=num2%10;
            sum=(a+b+carry);
            ans=(sum%base)+ans;
            carry=(sum/base);
            num1/=10;
            num2/=10;
        }
        if(carry>0){
             ans=carry+ans;
        }
        System.out.println(ans);
    }
}
