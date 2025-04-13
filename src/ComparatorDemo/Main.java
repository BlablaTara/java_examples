package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    ArrayList<Person> personer;
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        personer = new ArrayList<>();
        Person person1 = new Person("Ulla", 65);
        Person person2 = new Person("Henning", 73);
        Person person3 = new Person("Julius", 8);
        Person person4 = new Person("Linnea", 23);
        personer.add(person1);
        personer.add(person2);
        personer.add(person3);
        personer.add(person4);

        System.out.println("Before sorting: " + personer + "\n \n");

        personer.sort(new PersonAgeComparator());
        //Ta listen or sortere. kune i comparable bruger du collection.sort

        System.out.println("After sorting: " + personer + "\n \n");
    }
}
