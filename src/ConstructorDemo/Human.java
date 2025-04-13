package ConstructorDemo;

public class Human {

    private String name;
    private int age;
    private double weight;

    public Human(String name, int age,double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println(this.name + " is eating");
        System.out.println(getName() + " is eating" );
        //Du kan både kalde den fra konstruktøren og fra din getter
        //getteren er så du kan kalde den i andre klasser.
    }

    public void drink(){
        System.out.println(getName() + " is drinking");
    }
}
