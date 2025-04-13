package ArrayMedJamie;

import java.util.ArrayList;

public class ArraylisteTest {

    ArrayList<Beer> beers;

    public static void main(String[] args) {
        new ArraylisteTest().run();
    }

    private void run() {
        beers = new ArrayList<>();
        Beer beer = new Beer("Vikingeblod", 120 , 49.99 ); // Argumenterne
        Beer beer1 = new Beer("Øllebølle", 5.3 , 99.99 ); // som initialiserer variablerne, navn, procent og pris.
        Beer beer2 = new Beer("Ællebælle", 4.2 , 34.75 );
        Beer beer3 = new Beer("Stout", 10.67 , 1.99 );

        beers.add(beer);
        beers.add(beer1);
        beers.add(beer2);
        beers.add(beer3);


        double sum = 0;

        for (int i = 0; i < beers.size(); i++) {
            sum = sum + beers.get(i).getAlkoholProcent();

        }
        System.out.printf("%.2f", sum);
        System.out.printf("%n%.2f", sum / beers.size());

        double mindsteVærdiAfAlkohol = Double.MAX_VALUE; // tilegner den største værdi

        for (int i = 0; i < beers.size(); i++){
            if (beers.get(i).getAlkoholProcent() < mindsteVærdiAfAlkohol){
                mindsteVærdiAfAlkohol = beers.get(i).getAlkoholProcent();
            }
        }
        System.out.println("\n" + mindsteVærdiAfAlkohol);


        System.out.println(beers.get(0));

        System.out.println(beers.get(beers.size()-1));




    }


}
