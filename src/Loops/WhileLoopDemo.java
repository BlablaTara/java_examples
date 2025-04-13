package Loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        new WhileLoopDemo().run();
    }

    private void run() {

        // Vi ønsker at printe "Hej" 20 gange og i stedet for at gøre
        // dette 20 gange, kan vi lave en while-loop-

        System.out.println("Hej");
        System.out.println("Hej");
        System.out.println("Hej"); // op til 20 - gaab

        //Så gør vi således:

        int i = 1; // vi starter loopen ved 1.
        while (i <= 5){ // sålænge i er mindre eller lig med 20
            System.out.println("Heej"); //Print dette.
            i++; // inde i loopet, plusser vi 1 til i. så den bliver 2, 3, 4, osv til 20.
        }

        int w = 1;
        while ( w <= 5 ) {
            System.out.println( w + " Hej");
            w++;
        }






    }

}
