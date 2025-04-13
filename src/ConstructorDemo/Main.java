package ConstructorDemo;

public class Main {
    private Human human;
    private Human human2;
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {
        human = new Human("Morgens", 85, 89);
        human2 = new Human("Ellen", 78, 67);

        System.out.println(human2.getName());

        human2.eat();
        //Der kommer 2, fordi metoden er lavet sådan.
        human.drink();

    }
}
