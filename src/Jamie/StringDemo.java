package Jamie;

import java.util.Scanner;

public class StringDemo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new StringDemo().run();
    }

    private void run() {
        String fornavn;
        String efternavn;
        String navn;
        String navn1 = "Juhuuluu";
        System.out.println("Indtast dit fulde navn: ");
        navn = scanner.nextLine();
        System.out.println(navn.charAt(0));
        System.out.println(navn.length());
        System.out.println(navn.charAt(navn.length()-1));
        System.out.println(navn.equals(navn1));
        System.out.println(navn.concat(navn1));
        System.out.println( navn + navn1);
        System.out.println(navn.replace("Tara", "Den sejeste"));
        System.out.println(navn.replace(" ", ""));

        System.out.println(navn.split(" "));

    }




}
