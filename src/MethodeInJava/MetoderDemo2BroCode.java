package MethodeInJava;

public class MetoderDemo2BroCode {
    private String name = "Bro";
    private int age = 21;

    public static void main(String[] args) {
        new MetoderDemo2BroCode().run();
    }

    private void run() {
        hello(name, age); //Argument
    } // Parameter og argument behøver ikke at være det samme,
    // for at udskrive det samme

    public void hello(String uhuu, int age){ //Parameter
        System.out.println("Hello " + uhuu + age);
    }


}
