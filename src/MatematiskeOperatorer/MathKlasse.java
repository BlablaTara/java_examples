package MatematiskeOperatorer;

public class MathKlasse {
    //Initiliserede variablerne
    int x = 10;
    int y = 3;

    //De forskellige udregninger

    int sum = x + y;
    int difference = x - y;
    int gangetSammen = x * y;
    int divideret = x / y;
    int helTalsDivisionsRest = x % y; //modulus


    public static void main(String[] args) {

        //MATH-KLASSE

        double a = 3.14;
        double b = -10;
        int c = 2;
        int d = 25;

        //Største tal
        double ab = Math.max(a, b);
        System.out.println(ab + "\n");

        //Mindste tal
        double ba = Math.min(a, b);
        System.out.println(ba + "\n");

        //Kvadratroden - squareRoot
        //VIL ALTID RETUNERE EN DOUBLE
        double kvadrat = Math.sqrt(b);
        int kvadrat2 = (int) Math.sqrt(d);
        System.out.println("Kvadratroden af: -10 = " + kvadrat + "\n og af 25 = "
        + kvadrat2 + "\n");
        //Kan godt læse en int i (), men vil retunere en double.
        double kvadrat3 = Math.sqrt(d);

        //Potensregning
        double powResultat2 = Math.pow(d, c); // d opløftet i c (25 i andenpotens)
        System.out.println(powResultat2);

        //Afrundning
        double afrunding = Math.round(a);
        System.out.println("\nAfrundning: af 3.14 = " + afrunding);
        double afrundningAf2Tal = Math.round(a + d);
        //Kan afrunde resultat også
        System.out.println("Afrundning: af 3.14 + 25 = " + afrundningAf2Tal);

        //Afrundning opad (Ceiling)
        double afrundningHøj = Math.ceil(a);
        System.out.println("\n" + afrundningHøj);

        //Afrundning nedad (Floor)
        double afrundningLav = Math.floor(a);
        System.out.println("\n" + afrundningLav);

        //Random - Retunerer bare et random tal.
        double random = Math.random();
        System.out.println("Random tal: " + random);
        double randomMellem = Math.random() * 10 +1;
        System.out.println("Random tal i mellem 1 og 10 : " + randomMellem);
        int randomMlHeltal = (int) (Math.random() * 10) + 1;
        System.out.println("Random tal i mellem 1 og 10 som heltal: " + randomMlHeltal);

        System.out.println("\n**** Nu kommer opgaver fra Chatmanden **** \n");

        int tal1 = 23;
        int tal2 = 5;

        double kvadratAfSammenlagt = Math.sqrt(tal1 + tal2);
        System.out.println("Kvadratroden af 23 + 5 er: " + kvadratAfSammenlagt);








    }

public void OvelserFraChatManden (){

        int tal1 = 23;
        int tal2 = 5;

        double kvadratAfSammenlagt = Math.sqrt(tal1 + tal2);
    System.out.println("Kvadratroden af 23 + 5 er: " + kvadratAfSammenlagt);

}






}
