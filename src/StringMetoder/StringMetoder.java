package StringMetoder;

public class StringMetoder {
    public static void main(String[] args) {

        String ex = "Hello World";

        //INDEXOF
        System.out.println("\n** indexOf **");
        //Bruges til at finde ud af hvor et et ord eller bogstav er indexerede i strengen.
        int index = ex.indexOf("World");
        System.out.println("index af ordet 'World' er: " + index);
        // output 6. vi tæller fra 0. og ved 6, starter 'World'

        int index2 = ex.indexOf('d'); //med char
        //kan kun retunere en int. hvis den ikke kan finde hvad vi søger retunerer den -1.

        System.out.println("indexet af d er: " + index2);

        int index3 = ex.indexOf('l');
        System.out.println("Jeg støder på l første gang ved index: " + index3); // den giver dig bogstavet første gang den støder på det.


        //SUBSTRING
        System.out.println("\n** substring **");
        //Bruges til at udtrække en del af en streng.
        String subString = ex.substring(7, 10); //tæller fra fra 0 op til 7. gemmer 7,8,9 og stopper ved 10.
        System.out.println("SubString: " + subString); // output 'orl'


        //LENGTH
        System.out.println("\n** length **");
        //Bruges til at retunere antallet af tegn i strengen.
        int length = ex.length();
        System.out.println("Længde på stringen: " + length);

        //CHARAT
        System.out.println("\n** charAt **");
        // Bruges til at hente hvor i strengen er bestemt bogstav er.
        char charAtIndex = ex.charAt(4);
        System.out.println("Bogstav nr. 4 i 'Hello World' er: " + charAtIndex);

        //TOUPPERCASE / TOLOWERCASE
        System.out.println("\n** toUpperCase og toLowerCase **");
        String upperCase = ex.toUpperCase();
        String lowerCase = ex.toLowerCase();

        System.out.println("Store: " + upperCase + ". \nSmå: " + lowerCase );
        System.out.println(ex.toUpperCase());
        //Kan også printes ud således


        //EQUALS IGNORE CASE
        System.out.println("\n** equalsIgnoreCase **");
        //Bruges til at sammenligne to tekst strenge og ignorere de store og små bogstaver.
        String ex2 = "HeLLO WORLD";
        boolean erEqualIgnoreCase = ex2.equalsIgnoreCase(ex);
        //Er ordet 'world' også i tekststreng 2 (ex)?
        System.out.println("Er tekst ex2 og tekst ex ens (udover store og små bogstaver)? = " + erEqualIgnoreCase);

    }

}
