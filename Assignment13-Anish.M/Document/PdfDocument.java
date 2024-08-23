package Document;

public class PdfDocument extends Document{
    
    String extention;

    PdfDocument(String title){
        super(title);
        this.extention = ".pdf";
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
