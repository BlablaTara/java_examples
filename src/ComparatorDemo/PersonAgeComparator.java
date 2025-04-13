package ComparatorDemo;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) { //o står for objekt1 og objekt2
        return Integer.compare(person2.getAge(), person1.getAge());
    }
}
