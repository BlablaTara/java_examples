package ArrayOgArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOgArrayListeSamlet {
    public static void main(String[] args) {


        //CREATE - LAV en arrays-lister
        //ARRAY
        //Kan indeholde int, boolean eller objecter, studerende f.eks
        String[] friendsArray = new String[4];
        String[] friendsArrays2 = {"John", "Chris", "Eric", "Luke"};

        //ARRAYLISTE
        //kan kun holde objecter, så primitive datatyper,
        // skal man bruger wrapperklassen, f.eks i stedet for int, så en Interger
        ArrayList<String> friendsArrayList = new ArrayList<>();
        friendsArrayList.add("emma");
        friendsArrayList.add("tara");
        friendsArrayList.add("nanna");


        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        //GET
        //Get, hent specifikt element i listen
        System.out.println(friendsArrays2[1]);

        System.out.println(friendsArrayList2.get(1));

        //Hent størrelse
        System.out.println(friendsArrays2.length);

        System.out.println(friendsArrayList2.size());

        //ADD
        //Tilføj et element OBS: Kan kun til liste, da array er fikseret i størrelse
        friendsArrayList2.add("Mitch");

        //SET
        //Ændre et elemetn i listerne
        friendsArrays2[0] = "Carl";
        System.out.println(friendsArrays2[0]);

        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));

        //REMOVE
        //Da en array er fikseret kan vi ikke fjerne et element
        friendsArrayList2.remove(1); //Du kan også skrive selve navnet fra listen
        System.out.println();

        //PRINT
        System.out.println("the one we are looking at" + friendsArrayList);
        System.out.println(friendsArrays2); //Hukommelses
        System.out.println(friendsArrayList2); //denne indeholder en toString, så den printer
        System.out.println();

        //PRINT ARRAY
        for (int i = 0; i < friendsArrays2.length; i++){
            System.out.println(i); // udskriver kun 0, 1, 2, 3
        }
        System.out.println();

        //Gammel for-løkke
        for (int i = 0; i < friendsArrays2.length; i++){
            System.out.println(friendsArrays2[i]);
        }
        System.out.println();

        //For each løkke:
        for (String friends : friendsArrays2){
            System.out.println(friends);
        }

        //PRINT ARRAYLISTE ARRYLISTE ARRAYLISTE ARRAYLISTE ARRAYLISTE ARRYLISTE ARRAYLISTE ARRAYLISTE

        for (int i = 0; i < friendsArrayList2.size(); i++){
            System.out.println(i); // udskriver kun 0, 1, 2, 3
        }
        System.out.println();

        //Gammel for-løkke
        for (int i = 0; i < friendsArrayList2.size(); i++){
            System.out.println(friendsArrayList2.get(i));
        }
        System.out.println();

        //For each løkke:
        for (String friends : friendsArrayList2){
            System.out.println(friends);
        }





    }


}
