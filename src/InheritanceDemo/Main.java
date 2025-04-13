package InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
         Car car = new Car();
         Bicycle bicycle = new Bicycle();

         car.go(); // metode fra Vehicle klassen
         car.stop();
        System.out.println(car.getSpeed()); // Attribbut fra Vehicle klassen
        System.out.println("This car has " + car.getWheels() + " wheels");
        // Ovenover, egen atrribut til car klassen.

        System.out.println();
        bicycle.go();
        bicycle.stop();
        System.out.println(bicycle.getSpeed());
        System.out.println("This bicycle has " + bicycle.getPedals() + " pedals");

    }
}
