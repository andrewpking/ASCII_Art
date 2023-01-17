package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        File f = new File("ASCII_Art.txt");
        try (PrintStream p = new PrintStream(f)) {
            ASCIIArt frog = new Frogs(p,"Drew");
            frog.printAnimalsAndName(4);
            frog.printAnimalsAndNameToFile(4);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }


    }
}