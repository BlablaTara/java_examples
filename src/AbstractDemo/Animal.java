package AbstractDemo;

public abstract class Animal {
    private int age;
    private String name;


    public abstract void makeNoise();
    //Metode uden en body, da det ikke giver meneing når vi
    // ikke kan lave et objekt af denne klasse.
    // derfor laver vi en implementering af den
    // abstrakte metode i subklasserne.

    public void printName(){
        System.out.println("My name is " + name);
    }
    // vi kan sagten have metoder i abstracvt klassen
    //som ikke er abstracte, og som derfor ikke skal
    //implementeres og instansieres i subklassen

}
