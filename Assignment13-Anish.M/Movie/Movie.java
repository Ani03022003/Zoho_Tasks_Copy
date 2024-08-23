package Movie;

abstract public class Movie {
    private String title;
    private String director;
    private float rating;
    private int duration;
    private String genre;
    private String releaseDate;
    private String description;
    private String[] cast;
    private String language;
    private String review;


    Movie(String title, String director, float rating, int duration, String genre, String releaseDate, String description, String[] cast, String language,String review){
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.description = description;
        this.cast = cast;
        this.language = language;
        this.review = review;
    }

    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Description: " + description);
        System.out.print("Cast: ");
        for (String actor : cast) {
            System.out.print(actor + ", ");
        }
        System.out.println("\nLanguage: " + language);
    }
    
    public String getTitle() {
        return title;
    }
    public String getReview(){
        return review;
    }
    public int getDuration() {
        return duration;
    }
    abstract public void play();
    abstract public void stop();
    abstract public void pause();
    abstract public void resume();
    abstract public void review(String review);

}
