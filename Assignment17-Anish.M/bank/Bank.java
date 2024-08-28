package Assignment_15.bank;

public class Bank {
    public void deposit(Account account,int amount){
        System.out.println("Amount Deposited: "+amount);
        account.setBalance(account.getBalance()+amount);
    } 
    public void withDrawl(Account account,int amount){
        if(account.getBalance()<amount){
            try{
            throw new InsufficientBalanceException("Balance is Insuccifient");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Amount withdrawed : "+amount);
            account.setBalance(account.getBalance()-amount);
        }
    }

}
