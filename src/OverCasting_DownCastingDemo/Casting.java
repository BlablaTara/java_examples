package OverCasting_DownCastingDemo;

public class Casting {
    public static void main(String[] args) {
        new Casting().run();
    }
    //Upcasting er at tage dog objekt og 'caste' den til Animal
    //DownCasting er vice versa

    private void run() {

        //Upcasting (Subclass dog til Superclass Animal)
        //Laver et new dog object og 'caster' til Animal.
        Animal myAnimal = new Dog();
        //denne kan gør alt fra Animal, men ikk det som dogklassen kan
        myAnimal.makeNoise();

        doAnimalStuff(myAnimal);//siger woof woof, fordi vi upcastede i linje 14

        //vi behøver dog ikke at lave upcastingen her, da vi har gjort det i metoden.
        //hvis vi i stedet for linje 14 skrev:
        Dog dog = new Dog();
        doAnimalStuff(dog); // Bliver denne upcastet via metoden.

        Cat cat = new Cat();
        doAnimalStuff(cat); //Upcastet via metoden. Går igennem animal
        cat.makeNoise(); //Todo dog usikker på hvorfor jeg ikke bare can sige dette?

        //DownCasting ****************************************
        // Her tager vi vores Animal object og downcaster det til en dog.
        //Ny metode til at initialisere
        System.out.println("****Prøvning af downgrading metode****");
        doAnimalStuffDog(dog); // kan tage metoder både fra animal og dog klassen
        //DEtte virker fordi vi i linje 22 har kladt vore Dog klasse. Hvis det var en cat, så ville programmet dø

    }

    public void doAnimalStuff(Animal animal){ //Dette gør at vi ikke skal tage hver enkel klasse igennem
        animal.makeNoise(); // og lav hver deres metode for at få dem til at makeNoise
    }

    public void doAnimalStuffDog (Animal animal){ //samme som over, bare rette til downcastin
        animal.makeNoise();
        if (animal instanceof Dog){
            Dog myDogDown = (Dog) animal;
            myDogDown.growl();
        }
        //Selvom vi i parameteren har sagt vi kan tage ALLE dyr,
        //har vi i linje 44 fortalt at vi tage Dog, så vi kan growl()
        //Hvis vi tager cat går den ned, så i stedet gør vi dette med if.

        //Nu udskriver den makeNoise lige meget hvilket dyr, og hundelydende hvis det er en hund.
    }


}
