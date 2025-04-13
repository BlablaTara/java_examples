package EnumOevelser;

public class EnumDEmo2 {
    public static void main(String[] args) {

        int i = 5;
        Status run = Status.RUNNING;
        System.out.println(run);

        //Du kan også vælge et object baseret på numre.

        System.out.println(run.ordinal());
        //NU printer den runnings række i tal ud. Hvilket er 0.

        Status[] all = Status.values();
        System.out.println(all[0]); //Printer kun running.
        System.out.println();

        //Print alt = for-loop-
        for (Status liste : all){
            System.out.println(liste);
        }

        System.out.println();

        for (Status liste : all){
            System.out.println(liste + ": " + liste.ordinal());
        }







    }

}
