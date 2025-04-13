package Conditionals;

public class TestJamie_if_if_if {

    public static void main(String[] args) {
        new TestJamie_if_if_if().run();

    }

    private void run() {
        int testScore = 101;
        int point = 0;

        if (testScore > 100){ // CHAINING
            //if () - NESTING
            point = point + 10;
        }
        if (testScore > 75){
            point = point + 7;
        }
        if (testScore> 50){
            point = point + 4;
        }
        if (testScore == 0){
            point = point - 3;
        }
        System.out.println(point);



    }
}
