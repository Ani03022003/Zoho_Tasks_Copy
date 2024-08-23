import java.util.List;

public class Team {
    private String name;
    private String division;
    private String city;
    private List<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void hireCoach(){

    }

    public void playGame(){
        
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
