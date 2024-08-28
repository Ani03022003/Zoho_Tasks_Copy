package Assignment_15;
/*
 * 1. Write a program for division with proper divide-by-zero exception handling
 */
public class DivideByZero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int ans;
        try {
           ans = a/b; 
           System.out.println(ans);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Divide By Zero is Not Allowed :");
        }
        
    }
}
