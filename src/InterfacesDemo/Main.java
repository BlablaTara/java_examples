package InterfacesDemo;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        System.out.println();
        fish.flee();
        System.out.println();
        fish.hunt();

    }
}
