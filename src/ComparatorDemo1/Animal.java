package ComparatorDemo1;

public class Animal {
    private String animalType;
    private int animalSize;

    public Animal(String animalType, int animalSize) {
        this.animalType = animalType;
        this.animalSize = animalSize;
    }

    public int getAnimalSize() {
        return animalSize;
    }

    @Override
    public String toString() {
        return "|Dyr: " + animalType + ". Størrelse: " + animalSize;
    }
}
