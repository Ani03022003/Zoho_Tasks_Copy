package library;

import java.util.ArrayList;

public class User {
    private String name;
    private int id;
    private Account account;
    private ArrayList<Book> ownBooks;

    public User(){
        
    }
    public User(String name, int id, Account account, ArrayList<Book> ownBooks) {
        this.name = name;
        this.id = id;
        this.account = account;
        this.ownBooks = ownBooks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public ArrayList<Book> getOwnBooks() {
        return ownBooks;
    }
    public void setOwnBooks(ArrayList<Book> ownBooks) {
        this.ownBooks = ownBooks;
    }
    public void verify(){
        //Verify implementation
    }
    public void  checkAccount(){
        // CheckAccount implementation
    }
    public void  getBookInfo(){
        // get_book_info implementation
    }

}
