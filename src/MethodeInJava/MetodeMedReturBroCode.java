package MethodeInJava;

public class MetodeMedReturBroCode {

    private int x = 3;
    private int y = 4;
    private String shouting = "Hvorfor råber duuu?";
    int[] awsomeArray = gimmeArrayFromInts(3, 7, 1);

    public static void main(String[] args) {
        new MetodeMedReturBroCode().run();
    }

    private void run() {
   int z = add(x,y);
        System.out.println("*** RETUNERER INT ***");
        System.out.println(z);
         //Anden måde at gøre det på er dette.
        System.out.println(add(x, y));
        add2(x, y); //Bliver ikke skrevet ud nogen stedet.
        System.out.println(add2(4,5));
        System.out.println();

        System.out.println("*** RETUNERER STRINGS ***");
        System.out.println(caps(shouting));
        System.out.println(caps("Hey dude"));

        System.out.println("*** RETUNERER ARRAY ***");
        System.out.println(awsomeArray[0]);
        System.out.println(awsomeArray[1]);
        System.out.println(awsomeArray[2]);
    }

    // RETUNERER INTEGERS ELLER INT
    public int add(int x, int y){
       int z = x + y;
        return z;
    }
    public int add2 (int x, int y){
        return x + y; //Kan ikke skrive andet ud end en int.
    }

    //RETUNERER STRINGS
    public String caps(String shouting){

        return shouting.toUpperCase();
    }

    public int[] gimmeArrayFromInts (int a, int b, int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;
    }
}
