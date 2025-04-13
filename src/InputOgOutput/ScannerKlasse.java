package InputOgOutput;

import java.util.Scanner;

public class ScannerKlasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner input til dette system

        System.out.println("Indtast dit navn: ");
        String brugerNavn = scanner.nextLine();

        System.out.println("Dit navn er: " + brugerNavn);

        System.out.println("Indtast nu din alder: ");
        int brugerAlder = scanner.nextInt();

        System.out.println("Hej med dig, " + brugerNavn + ", som er " + brugerAlder + " år gammel :)");
    }


}
