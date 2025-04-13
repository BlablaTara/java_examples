package OverCasting_DownCastingDemo;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }

    public  void growl(){
        System.out.println("Grrrrr");
    }


    //Upcasting er at tage dog objekt og 'caste' den til Animal
    //DownCasting er vice versa
}
