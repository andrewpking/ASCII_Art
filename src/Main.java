package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        File f = new File("ASCII_Art.txt");
        try (PrintStream p = new PrintStream(f)) {
            ASCIIArt frog = new Frogs();
            StringBuilder frogs = frog.printASCIIArt("Drew");
            p.print(frogs);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        ASCIIArt dog = new Dogs();
        StringBuilder namedDogs = dog.printASCIIArt("Jalisa");
        StringBuilder dogs = dog.printASCIIArt(3);
        System.out.print(namedDogs);
        System.out.print(dogs);
    }
}