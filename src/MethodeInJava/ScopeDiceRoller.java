package MethodeInJava;

import java.util.Random;

public class ScopeDiceRoller {
    Random random; // Globale variabler
    int number = 0; // Globale variabler

    public ScopeDiceRoller(){ //Konstruktøren
        random = new Random(); //Instantieres i konstruktøren, så den laver ny random hver gang
        int exNum = 0; //Lokal variabel
        roll(); //Normalt kører man ikke ting fra konstruktøren??

    }

    public void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);


    }
}
