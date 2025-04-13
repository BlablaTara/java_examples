package ComparatorDemo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {

        ArrayList<Animal> dyr = new ArrayList<>();
        Animal løve = new Animal("Løve", 100);
        Animal egern = new Animal("egern", 25);
        Animal elefant = new Animal("elefant", 550);
        Animal mus = new Animal("mus", 5);
        Animal hund = new Animal("hund", 50);

        dyr.add(løve);
        dyr.add(egern);
        dyr.add(elefant);
        dyr.add(mus);
        dyr.add(hund);

        System.out.println("Før sortering: " + dyr);
        System.out.println();
        dyr.sort(new AnimalSizeComparator());

        System.out.println("Efter sortering: " + dyr);

    }
}
