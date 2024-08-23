package Document;

public class DocumentDemo {
    
    public static void main(String[] args) {
        Document document = new WordDocument("Sample1");
        document.documentInfo();
        document.openDocument();
        document.saveDocument();
        document.closeDocument();

        System.out.println();

        document = new PdfDocument("Sample2");
        document.documentInfo();
        document.openDocument();
        document.saveDocument();
        document.closeDocument();

        System.out.println();

        document = new ImageDocument("Sample3");
        document.documentInfo();
        document.openDocument();
        document.saveDocument();
        document.closeDocument();
    }
}
