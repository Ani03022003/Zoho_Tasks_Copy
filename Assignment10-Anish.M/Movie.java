public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private double rating;

    Movie(String title,String director,int releaseYear,String genre,double rating){
        this.title=title;
        this.director=director;
        this.releaseYear=releaseYear;
        this.genre=genre;
        this.rating=rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

class MovieDemo{
    static Movie[] movie=new Movie[5];

    public static void displayMovies(){
        for(int i=0;i<movie.length;i++){
            System.out.println("Movie Title: "+movie[i].getTitle());
            System.out.println("Director: "+movie[i].getDirector());
            System.out.println("Release Year: "+movie[i].getReleaseYear());
            System.out.println("Genre: "+movie[i].getGenre());
            System.out.println("Rating: "+movie[i].getRating());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        movie[0]=new Movie("Puli", "Chimbudevan", 2015, "Drama", 4.3);
        movie[1]=new Movie("Pithamagan", "Bala", 2003, "Crime", 8.3);
        movie[2]=new Movie("Sammy Square", "Hari", 2018, "Action", 4.5);
        movie[3]=new Movie("Sura", "S.P.Rajkumar", 2010, "Action", 3.0);
        movie[4]=new Movie("Aambala", "Sundar C.", 2015, "Drama", 4.7);
        displayMovies();
    }
}
