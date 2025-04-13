package ArrayMedJamie;

public class ArrayTest {
    int[] talArray = new int[4];
    public static void main(String[] args) {
        new ArrayTest().run();
    }

    private void run() {
        int sum = 0;

        talArray[0] = 10;
        talArray[1] = 23;
        talArray[2] = 5;
        talArray[3] = 8;

        for (int i = 0; i < talArray.length; i++) {
            sum = sum + talArray[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Gennemsnit: " + sum / talArray.length);

        //String
        String[] navn = new String[4];
        String[] navn1 = {"jamie", "emilia", "Tara", "gustav"};
        navn[0] = "Bo";
        navn[1] = "Ulla";
        navn[2] = "Knud";
        navn[3] = "Ursula";

        System.out.println(navn1);

        for (int i = 0; i < navn1.length; i++){
            System.out.println(navn1[i]);
        }



    }

    //public int sumFraArray (){

   // }

}
