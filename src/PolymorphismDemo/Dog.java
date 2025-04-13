package PolymorphismDemo;

public class Dog extends Animal {
    private int breed;

    @Override
    public void eat() {
        System.out.println("chomp chomp");
    }
}
