package PolymorphismDemo;


public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {

        Animal myAnimal = new Animal();
        myAnimal.eat();

        Cat cat = new Cat();
        cat.eat();

        Dog myDog = new Dog();
        myDog.eat();
    }
}
