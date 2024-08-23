package library;

import java.util.ArrayList;

public class  Book {
    private String title;
    private String author;
    private int ISBN;
    private String publication;

    private ArrayList<User> userList;

    public Book(String title, String author, int iSBN, String publication, ArrayList<User> userList) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
        this.publication = publication;
        this.userList = userList;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public ArrayList<User> getUserList() {
        return userList;
    }
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    public void showDueDt(){
        //Show_duedt implemention
    }
    public void reservationStatus(){
        //Reservation_status implemention
    }
    public void feedBack(){
        //Feedback implemention
    }
    public void bookRequest(){
        //Book_request implemention
    }
    public void RenewInfo(){
        //Renew_info implemention
    }
}
