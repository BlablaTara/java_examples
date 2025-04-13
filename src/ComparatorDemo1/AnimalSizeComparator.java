package ComparatorDemo1;

import java.util.Comparator;

public class AnimalSizeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAnimalSize(), o2.getAnimalSize());
    }
}
