package Conditionals;

import java.util.Scanner;

public class CodeLab_if_Else_LogicalOperators {
    Scanner scanner = new Scanner(System.in);
    private int quizInput;
    private int midTermsInput;
    private int finalScore;
    public static void main(String[] args) {
        new CodeLab_if_Else_LogicalOperators().run();

    }

    private void run() {
    askForUserInput();
    generateGrade(quizInput, midTermsInput, finalScore);
    showGrades();
    }

    public void askForUserInput(){
        System.out.println("** Hello and wellcome **");
        System.out.println("Let me determind your grade based on your score in the quiz and in the midterm.");
        System.out.println("First tell me your score in the quiz (1-100)");
        quizInput = scanner.nextInt();
        scanner.nextLine(); //Scanner bug
        System.out.println("Then tell me what your score in your midterms (1-100)");
        midTermsInput = scanner.nextInt();
        scanner.nextLine(); //scanner bug
        System.out.println("Last but not least, what is your final score? (1-100)");
        finalScore = scanner.nextInt();
        scanner.nextLine();// scanner bug
    }

    public void generateGrade (int quizInput, int midTermsInput, int finalScore){
        int sumOfGrades = quizInput + midTermsInput + finalScore;
        int averageScore = sumOfGrades / 3;

        if (averageScore >= 90){
            System.out.println("Your grade is A");
        } else if (averageScore >= 70 && averageScore < 90){
            System.out.println("Your grade is B");
        } else if (averageScore >= 50 && averageScore < 70 ){
            System.out.println("Your grade is C");
        } else if (averageScore < 50){
            System.out.println("Your grade is F");
        } else{
            System.out.println("Your input is not valid");
        }

        System.out.println("This was your average score: " + averageScore);

    }

    public void showGrades(){
        float quix_score, mid_score, final_score, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz score");
        quix_score = sc.nextFloat();
        System.out.println("Mid-term score:");
        mid_score = sc.nextFloat();
        System.out.println("Final score:");
        final_score = sc.nextFloat();
        avg = (quix_score + mid_score + final_score)/3;

        if (avg>=90) System.out.println("Yout grade A");
        else if (avg>=70 && avg<90) System.out.println("Your grade is B");
        else if (avg>=50 && avg<70) System.out.println("Your grade is C");
        else if (avg<50) System.out.println("Your grade is F");
        else System.out.println("Invalid");
    }

}
