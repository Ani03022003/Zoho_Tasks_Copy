package library;

import java.util.ArrayList;

public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;

    private ArrayList<User> userList;
    private ArrayList<Book> bookList;
    private Librarian librarian;
    
    public LibraryManagementSystem(String userType, String userName, String password, ArrayList<User> userList,
            ArrayList<Book> bookList, Librarian librarian) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.userList = userList;
        this.bookList = bookList;
        this.librarian = librarian;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<User> getUserList() {
        return userList;
    }
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    public ArrayList<Book> getBookList() {
        return bookList;
    }
    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    public void login(){
        //login implementation
    }
    public void  register(){
        //Register implementation
    }
    public void  logout(){
        //logout implementation
    }


}