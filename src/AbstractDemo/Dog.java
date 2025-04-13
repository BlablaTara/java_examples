package AbstractDemo;

import OverCasting_DownCastingDemo.Animal;

public class Dog extends Animal implements AnimalStuff{

    @Override //metode fra superclass Animal
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override //Metode fra interface AnimalStuff
    public void poop() {
        System.out.println("phlbblbplbplbb");

    }
}
