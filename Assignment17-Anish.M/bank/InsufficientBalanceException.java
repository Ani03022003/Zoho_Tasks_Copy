package Assignment_15.bank;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String name){
        super(name);
    }
}
