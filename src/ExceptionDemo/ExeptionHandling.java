package ExceptionDemo;

public class ExeptionHandling {
    public static void main(String[] args) {

       //int myInt = Integer.parseInt("pants");

        //Denne ville normalt virke hvis Stringen faktisk indehold nogle tal ex: "234"
        //Når vi runner denne får vi fejl og en 'NumberFormatException'

        //I stedet for at programmet stopper, kan vi "handle" denne exception
        // ved at fange den med en ´try-catch´

        try {
            int myInt = Integer.parseInt("pants");
            // kode der måske forårsager en exception
            //ex - hvis filen ikke eksisterer. fileNotFound
        }                   // nfe er bar bogstaver fra Number Format Exception
        catch (NumberFormatException nfe){ // her indsættes den exception som skal 'fanges'.
            // kode som vi gerne vil 'runne' hvis denne type af exception finder sted.
            System.out.println("hey dude, you cant make an int out of that.");
        }
        System.out.println("The end");

        //Exception kan fange alle. (Pokemon - "gotta catch them all"
        // men den specifikke kan fange den exception + alle exceptions under i heakiet

        // du behøver ikke at catche din exception lige der hvor det sjker, for den bliver sendt
        // op til metoden i klassen som kalder den. det kaldes en 'call stack' indtil den
        // bliver 'cathet' af en catch statement som vores.




    }
}
