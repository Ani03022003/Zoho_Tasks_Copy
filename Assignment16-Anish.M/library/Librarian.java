package library;

import java.util.ArrayList;

public class Librarian {
    private String name;
    private int id;
    private String password;
    private String searchString;  
    
    private LibraryDatabase data;
    private ArrayList<Book> ownBooks;

    public Librarian(String name, int id, String password, String searchString, LibraryDatabase data,
            ArrayList<Book> ownBooks) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
        this.data = data;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSearchString() {
        return searchString;
    }
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    public LibraryDatabase getData() {
        return data;
    }
    public void setData(LibraryDatabase data) {
        this.data = data;
    }
    public ArrayList<Book> getOwnBooks() {
        return ownBooks;
    }
    public void setOwnBooks(ArrayList<Book> ownBooks) {
        this.ownBooks = ownBooks;
    }
    public void verifyLibrarian(){
        //Verify_librarian implemention
    }
    public void search(){
        //Search implemention
    }
}