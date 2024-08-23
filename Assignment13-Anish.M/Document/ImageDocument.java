package Document;

public class ImageDocument extends Document{
    
    String extention;

    ImageDocument(String title){
        super(title);
        this.extention = ".jpeg";
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
