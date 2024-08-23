public class Vehicle {
    public void start(){}
    public void stop(){}
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike started");
    }
    public void stop(){
        System.out.println("Bike stoped");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stoped");
    }
}
class Main1{
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        Vehicle car=new Car();
        bike.start();
        car.start();
        bike.stop();
        car.stop();
    }
}