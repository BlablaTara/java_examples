package ArrayOgArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {

        //behøver ikke at specificere en størrelse - vokser og krymper med indholdet.

        ArrayList<String> friendsArrayList = new ArrayList<>();
        //Dette er bare en arrayliste med Strings

        //Hvis du fra start af vil initialisere din arrayListe ser det sådan ud:
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Dolly"));
        //Hvis det skal være andet end String, så brug wrapperklasserne af de froskellige datatyper. eks i steder for int så Integer.

        //for at hente et specofok navn fra arrayListen skal man "hente" det-
        System.out.println(friendsArrayList2.get(2));
        System.out.println();

        //hele listen kan printes ud via en for-Løkke.
        for (String friends : friendsArrayList2 ){
            System.out.println(friends);
        }
        System.out.println();

        //Eller den gammeldags løkke.
        for (int i = 0; i < friendsArrayList2.size(); i++){ //dette udkriver bare 0,1,2
            System.out.println(i);  //dette udkriver bare 0,1,2
            System.out.println(friendsArrayList2.get(i)); // Dette udskriverne hvad i indeholder
        }
        System.out.println();
        System.out.println(friendsArrayList2.size()); //uden løkke skriver den bare hvor meget der ligge i listen.

        //TILFØJELSE TIL ARRAYLISTE

        friendsArrayList.add("Mitch");
        //mitch er nu tilføjet bagerst i listen.

        //ændre i listen:
        friendsArrayList2.set(0, "carl"); //den uskriver nu carl i listen, i stedet for John
        for (String friends : friendsArrayList2 ){
            System.out.println(friends);
        }

        //fjern et elemnt fra listen.
        friendsArrayList2.remove(3); //Kan også skrive navnet du vil fjerne








        //Du kan også skrive en klasse derind så det bliver en arrayliste med f.eks studerende
       // ArrayList<StuderendeTilArrayListe>studerende





    }
}
