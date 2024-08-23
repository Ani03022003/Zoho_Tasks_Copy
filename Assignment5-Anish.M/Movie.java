public class Movie {
    public void typeOfMovie(){}
    public void availableTickets(){}
}
class RomComMovie extends Movie{
    public void typeOfMovie(){
        System.out.println("Romance Comedy Movie");
    }
    public void availableTickets(){
        System.out.println("10 tickets availabe");
    }
}
class ThrillerMovie extends Movie{
    public void typeOfMovie(){
        System.out.println("Thriller Movie");
    }
    public void availableTickets(){
        System.out.println("20 tickets availabe");
    }
}
class HorrorMovie extends Movie{
    public void typeOfMovie(){
        System.out.println("Horror Movie");
    }
    public void availableTickets(){
        System.out.println("2 tickets availabe");
    }
}
class Main2{
    public static void main(String[] args) {
        Movie romcom=new RomComMovie();
        Movie thriller=new ThrillerMovie();
        Movie horror=new HorrorMovie();
        romcom.typeOfMovie();
        romcom.availableTickets();
        thriller.typeOfMovie();
        thriller.availableTickets();
        horror.typeOfMovie();
        horror.availableTickets();

    }
}
