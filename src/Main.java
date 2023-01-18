package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        File f = new File("ASCII_Art.txt");
        try (PrintStream p = new PrintStream(f)) {
            ASCIIArt frog = new Frogs(p,"Drew");
            frog.printAnimalsAndName(frog.getNameLength());
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        ASCIIArt dog = new Dogs("Jalisa");
        dog.printAnimalsAndName(dog.getNameLength());

    }
}