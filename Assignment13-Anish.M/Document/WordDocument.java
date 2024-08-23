package Document;

public class WordDocument extends Document{

    String extention;

    WordDocument(String title){
        super(title);
        this.extention = ".docx";
    }

    void openDocument(){
        System.out.println("Opening " + getTitle() + extention + "...");
    }

    void saveDocument(){
        System.out.println("Saving " + getTitle() + extention + "...");
    }

    void closeDocument(){
        System.out.println("Closing " + getTitle() + extention + "...");
    }
}