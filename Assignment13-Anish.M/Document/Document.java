package Document;

abstract public class Document {
    
    private String title;

    Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    void documentInfo() {
        System.out.println("Title: " + getTitle());
    }

    abstract void openDocument();
    abstract void closeDocument();
    abstract void saveDocument();
}
