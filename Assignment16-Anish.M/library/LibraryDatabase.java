package library;

import java.util.ArrayList;

public class LibraryDatabase{
    ArrayList<Book> listOfBooks;
    ArrayList<Account> accounts;
    public LibraryDatabase(ArrayList<Book> listOfBooks, ArrayList<Account> accounts) {
        this.listOfBooks = listOfBooks;
        this.accounts = accounts;
    }
    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }
    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public void add(){
        //Add implemention
    }
    public void delete(){
        //Delete implemention
    }
    public void update(){
        //Update implemention
    }
    public void display(){
        //Display implemention
    }
    public void search(){
        //Search implemention
    }


}
