package Loops;

import java.util.ArrayList;

public class AllLoopEmilia {
    public static void main(String[] args) {


        int x = 1;

        while (x <= 5){
            System.out.println(x * x);
            x++;
        }

        int lige = 2;
        do {
            System.out.println("Lige tal: " + lige);
            lige = lige + 2;
        }
        while (lige <= 14);


        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        String[] a = {"HJqllo", "bala", "uhud"};
        ArrayList<String> aList = new ArrayList<>();

        for (int i = 0; i < a.length; i++){
            aList.add(a[i]);
        }

        for (String as : a){
            System.out.println(as);
        }

        for (String aLs : aList){
            System.out.println(aLs);
        }

        // NEDSTED LOOPS

        for (int i = 0; i < 5; i++){
            System.out.println();
        }





    }

}
