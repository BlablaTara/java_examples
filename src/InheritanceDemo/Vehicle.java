package InheritanceDemo;

public class Vehicle {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void go(){
        System.out.println("This vehicle is moving");
    }

    public void stop(){
        System.out.println("This vehicle is stopping");
    }

}
