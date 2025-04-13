package OOPDemo_Encapsulation;

public class Main {

    Car car;
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        car = new Car("Chevrolet", "Camere", 2020, "Blue", 150000);
        System.out.println(car.getMake() + car.getModel() + car.getYear() + car.getColor());
        car.setYear(2022);
        System.out.println(car.getMake() + car.getModel() + car.getYear() + car.getColor());







    }
}
