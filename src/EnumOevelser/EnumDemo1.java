package EnumOevelser;

import java.util.SortedMap;

public class EnumDemo1 {
    public static void main(String[] args) {

        // VIRKER IKKE. Da det er nogle værdier som allerede er sat, kan man ikke brug new til at lave nye værdier.
        //DaysOfTheWeek day = new DaysOfTheWeek();

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        //Vi kan bruge de værdier vi allerede har sat i vores ENUM.

        if (day == DaysOfTheWeek.THURSDAY){
            System.out.println("Yaay it's almost friday!");
        }

        //enum klassen er en extends af vores main klasse, men man behøver ikke skrive det, det betyder tilgengæld
        //at der er nogle allerede indbyggede metoder vi kan bruge.

        //Eksempel:
        DaysOfTheWeek.values();

        // udskriv med en for-loop
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }

        //VITRKER IKKEEEEE
       /* for ( int i = 0; i < DaysOfTheWeek.values().length(); i ++){
            System.out.println();
        }
        */
        System.out.println("CEREALS");
        System.out.println();

        // CEREALS CEREALS CEREALS CEREALS CEREALS CEREALS

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
        System.out.println(Cereals.COCOA_PUFFS);
        System.out.println(Cereals.CAPTAIN_CRUNCH.price);

        System.out.println("\nLækkerhedsskalaen: " + Cereals.FROOT_LOOPS.levelOfDeliciousness);
        System.out.println("Navn: " + Cereals.COCOA_PUFFS);
        System.out.println("Pris: " + Cereals.CAPTAIN_CRUNCH.price);

        //Kan ikke ændre da den er final i enums.
        // ---  Cereals.FROOT_LOOPS.levelOfDeliciousness = 100;





    }
}
