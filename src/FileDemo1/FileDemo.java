package FileDemo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {


        //FiPEP -Skriv til filer
        //FiSEN - Læs fra filer.

        //FiPEP - skriv
        File file = new File("Hellooo.txt");
        PrintStream ps;

        {
            try {
                ps = new PrintStream(file);
                ps.println("Heej hvor hyggeligt");
                ps.println("Hvordan går det?");
                ps.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        læsFile();


    }

    public static void læsFile() {
        File file = new File("Hellooo.txt");
        try {
            Scanner inFile = new Scanner(file);
            while (inFile.hasNextLine()){
                String s = inFile.nextLine();
                System.out.println("**** " + s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }





}
