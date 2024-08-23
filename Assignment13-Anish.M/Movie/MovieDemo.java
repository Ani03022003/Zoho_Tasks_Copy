package Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MovieDemo {
    static List<Movie> movies = new ArrayList<>();

    public static void createMovieList() {
        String[] romComCast = {"Ashok Selvan", "Ritika Singh", "Vani Bhojan"};
        Movie romCom = new RomanceComedy(
            "Oh My Kadavule",
            "Ashwath Marimuthu",
            8.1f,
            151,
            "Romantic Comedy",
            "14 February 2020",
            "A man receives a magical opportunity to relive his life, leading to a series of comical and romantic adventures.",
            romComCast,
            "Tamil",
            "A delightful and heartwarming romantic comedy with an interesting twist."
        );

        String[] actionThrillerCast = {"Karthi", "Narain", "Arjun Das"};
        Movie actionThriller = new ActionThriller(
            "Kaithi",
            "Lokesh Kanagaraj",
            8.5f,
            145,
            "Action Thriller",
            "25 October 2019",
            "A recently released prisoner must race against time to save a group of police officers from a deadly gang.",
            actionThrillerCast,
            "Tamil",
            "An intense and gripping action thriller with a powerful performance by Karthi."
        );

        String[] romComCast1 = {"Vijay Sethupathi", "Trisha Krishnan"};
        Movie romCom1 = new RomanceComedy(
            "96",
            "C. Prem Kumar",
            8.6f,
            158,
            "Romantic Drama",
            "4 October 2018",
            "Two high school sweethearts meet at a reunion after 22 years and reflect on their past and present.",
            romComCast1,
            "Tamil",
            "A poignant and beautifully crafted romantic drama with stellar performances."
        );
        
        String[] actionThrillerCast1 = {"R. Madhavan", "Vijay Sethupathi"};
        Movie actionThriller1 = new ActionThriller(
            "Vikram Vedha",
            "Pushkar-Gayathri",
            8.7f,
            147,
            "Action Crime Thriller",
            "21 July 2017",
            "A police officer sets out to track down and kill an equally intelligent and ruthless gangster.",
            actionThrillerCast1,
            "Tamil",
            "A thrilling and intellectually stimulating cat-and-mouse game with powerful performances."
        );
        
        String[] actionThrillerCast2 = {"Vijay", "Vijay Sethupathi"};
        Movie actionThriller2 = new ActionThriller(
            "Master",
            "Lokesh Kanagaraj",
            7.8f,
            179,
            "Action Crime Thriller",
            "13 January 2021",
            "An alcoholic professor is sent to a juvenile school, where he clashes with a gangster who uses children for his crimes.",
            actionThrillerCast2,
            "Tamil",
            "A high-octane action thriller with excellent performances by the lead actors."
        );

        movies.add(romCom);
        movies.add(actionThriller);
        movies.add(romCom1);
        movies.add(actionThriller1);
        movies.add(actionThriller2);
    }

    public static void main(String[] args) {
        createMovieList();
        int choice=0;
        Scanner s=new Scanner(System.in);
        while (choice!=5) {
            System.out.println("1. View Movies\n2. Select Movie\n3. Exit");
            System.out.println("Enter your Choice: ");
            choice=s.nextInt();
            switch (choice) {
                case 1:
                    for (Movie movie : movies){
                        movie.displayInfo();
                        System.out.println("X-----------------------------------------------------------------X");
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the movie ypu want to play: ");
                    String name=s.next();
                    for(Movie movie:movies){
                        if(movie.getTitle().equals(name)){
                            movie.play();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid Choice");    
            }
        }
        s.close();
    }
}
