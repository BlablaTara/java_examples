package Loops;

import java.util.Scanner;

public class DoWhileLoopNeso {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new DoWhileLoopNeso().run();

    }

    private void run() {

        int i = 1;
        do{
            System.out.println( i + " Hello");
            i++;
        } while (i <= 3);

        int userInput;
        do {
            System.out.println("Enter number between 1 and 10:");
            userInput = scanner.nextInt();
        } while(userInput < 1 || userInput >10);

        System.out.println( userInput + " Is between 1 and 10");



    }
}
