package library;

public class Account{
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private int fineAmount;

    public Account(int noBorrowedBooks, int noReservedBooks, int noReturnedBooks, int noLostBooks, int fineAmount) {
        this.noBorrowedBooks = noBorrowedBooks;
        this.noReservedBooks = noReservedBooks;
        this.noReturnedBooks = noReturnedBooks;
        this.noLostBooks = noLostBooks;
        this.fineAmount = fineAmount;
    }

    public int getNoBorrowedBooks() {
        return noBorrowedBooks;
    }

    public void setNoBorrowedBooks(int noBorrowedBooks) {
        this.noBorrowedBooks = noBorrowedBooks;
    }

    public int getNoReservedBooks() {
        return noReservedBooks;
    }

    public void setNoReservedBooks(int noReservedBooks) {
        this.noReservedBooks = noReservedBooks;
    }

    public int getNoReturnedBooks() {
        return noReturnedBooks;
    }

    public void setNoReturnedBooks(int noReturnedBooks) {
        this.noReturnedBooks = noReturnedBooks;
    }

    public int getNoLostBooks() {
        return noLostBooks;
    }

    public void setNoLostBooks(int noLostBooks) {
        this.noLostBooks = noLostBooks;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void calculateFine(){
        //Calculate_fine implemention
    }
    
}
