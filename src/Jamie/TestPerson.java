package Jamie;

public class TestPerson {
    public static void main(String[] args) {
    new TestPerson().run();
    }

    private void run() {
        Person person = new Person("Emma Vanilla");
        //Person person1 = new Person("Emma Vanilla Whats uuup");
        System.out.println(person);
    }
}
