package ArrayOgArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {

        String[] friendsArray = new String[4];
        // arrays størrelse skifter aldrig. Denne indeholder altid 4 pladser
        // fra start af er pladserne null
        System.out.println();
        for (String friends : friendsArray){
            System.out.println(friends); //Udskriver pt null null null null
        }


        //Hvis du fra start af vil initialisere din array ser det sådan ud:
        String[] friendsArray2 = {"John", "Chris", "Eric", "luke", "Dolly"};
        System.out.println();
        for (String friends : friendsArray2){
            System.out.println(friends);
        }


        // man kan også skrive således, for at få skrevet specifik det man vil fra arrayindexet.
        System.out.println();
        System.out.println(friendsArray2[2]); //husk den starter ved 0

        System.out.println(friendsArray2.length);
        //udskriver hvor mange navne der er i listen.
        //OBS med en ArrayListe, så skriver man size i stedet for length

        //ændre i listen:
        friendsArray2[0] = "Carl"; // istedet for John kommer Carl.
        for (String friends : friendsArray2){
            System.out.println(friends);
        }

        //fjern et elemnt fra listen.
        //kan ikke lade sig gøre, da størrelses af arrayet er fikseret
    }
}
