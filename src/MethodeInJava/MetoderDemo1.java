package MethodeInJava;

public class MetoderDemo1 {
    private int a; //Disse behøves heller ikke, men nok meget godt med private.
    //private int b;

    public static void main(String[] args) {
        new MetoderDemo1().run();

        //Denne kode behøves åbenbart ikke, men sikkert smart at gøre dem private.
        /*int a = 5;
        int b = 10;
        System.out.println(a * b);

         */
    }

    private void run() {
        welcome();
        multiply(2, 5); // Argumenter
        multiply(4, 8);
        multiply(7, 112);
        divide(20, 5);
        divide(100, 6);
        divide( 40, 11);
    }

    public void welcome(){
        System.out.println("** WELLCOME **");
    }

    public void multiply(int a, int b){ //Parametre
        System.out.println(a * b);

    }

    public void divide (int a, int b) { //Parametre
        System.out.println(a / b);
    }

}
