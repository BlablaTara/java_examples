package AbstractDemo;

public class Test {
    public static void main(String[] args) {
        new Test().run();

    }

    private void run() {

        Cat myCat = new Cat();
        myCat.makeNoise();

        Dog myDog = new Dog();
        myDog.makeNoise();
        myDog.poop();
    }
}
