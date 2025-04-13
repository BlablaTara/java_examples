package Loops;

import java.util.Scanner;

public class WhileLoopExerciseNeso {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new WhileLoopExerciseNeso().run();


    }

    private void run() {
        int userInput = scanner.nextInt();
    while (userInput < 1 || userInput > 10){
        System.out.println(userInput + " Is not between 1 and 10. Try again :)");
        userInput = scanner.nextInt();
    }

        System.out.println(userInput + " is between 1 and 10.");

    }
}
