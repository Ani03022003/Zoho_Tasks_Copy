import java.util.List;
import java.util.Collections;

public interface RemoteControlCar {

    void drive();

    int getDistanceTravelled();
}

class ExperimentalRemoteControlCar implements RemoteControlCar{

    int drive;
    public void drive() {
        drive++;
    }

    public int getDistanceTravelled() {
        return drive*20;
    }
}

class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    
    private int victories;
    int drive;
    
    public void drive() {
        drive++;
    }

    public int getDistanceTravelled() {
            return drive*10;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories=numberOfVictories;
    }

     public int compareTo(ProductionRemoteControlCar otherCar) {
         return Integer.compare(otherCar.getNumberOfVictories(),this.victories);
     }
}

class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}

