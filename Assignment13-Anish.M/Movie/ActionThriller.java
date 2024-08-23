package Movie;

public class ActionThriller extends Movie{

    ActionThriller(String title, String director, float rating, int duration, String genre, String releaseDate, String description,String[] cast,String language,String review) {
        super(title, director, rating, duration, genre, releaseDate, description,cast,language,review);
    }

    public void play() {
        System.out.println("Playing " + getTitle() + "...");
    }
    public void pause() {
        System.out.println("Pausing " + getTitle() + "...");
    }
    public void resume() {
        System.out.println("Resuming " + getTitle() + "...");
    }
    public void stop() {
        System.out.println("Stopping " + getTitle() + "...");
    }
    public void review(String review) {
        System.out.println("Review for " + getTitle() + ": " + getReview());
    }

}
