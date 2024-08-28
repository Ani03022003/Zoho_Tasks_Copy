/*
 * 3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input
 */
package Assignment_15;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Matcher;

public class PhoneNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Digit Phone Number : ");
        try{
        String phoneNo = sc.next();
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(phoneNo);
        boolean match = matcher.matches();
        sc.close();
        if(!match){
            throw new InputMismatchException("Enter a valid Phone Number");
        }
        System.out.println("Entered Phone Number is Valid");
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
}
