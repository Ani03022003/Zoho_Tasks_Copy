package Assignment3;

public class PrimeNumbers {
    public static boolean isPrime(int num){
        if(num==2)
            return true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int i=2;
        while(i<=30){
            if(isPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}
