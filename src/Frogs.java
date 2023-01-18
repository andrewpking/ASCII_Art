package src;

import java.io.PrintStream;

public class Frogs extends Animals {

    private String[] asciiArt = {"        _  _        ",
                     "       (.)(.)       ",
                     "   ,-.(.____.),-.   ",
                     "  ( \\ \\ '--' / / )  ",
                     "   \\ \\ / ,. \\ / /   ",
                     "    ) '| || |' (    ",
                     "OoO'- OoO''OoO -'OoO"};

    /**
     * Creates an ASCII Frog that is printable to the Terminal.
     */
    public Frogs(){
        super("_", "_");
    }

    /**
     * Creates an ASCII Frog with a name that is printable to the Terminal.
     * @param name is the name of the frog.
     */
    public Frogs(String name){
        super(name, "_");
    }

    /**
     * Creates an ASCII Frog that can be printed to a file.
     * @param print the PrintStream pointing to a file.
     */
    public Frogs(PrintStream print){
        super(print,"_", "_");
    }

    /**
     * Creates an ASCII Frog with a name that can be printed to a file.
     * @param print the PrintStream point to a file
     * @param name the name of the frog
     */
    public Frogs(PrintStream print, String name){
        super(print, name, "_");
    }

    @Override
    public void fillAnimalName(int index){
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index);
        asciiArt[2] = "   ,-.(._" + letter + "__.),-.   ";
    }

    @Override
    public void printAnimalsAndName(int quantity) {
        this.printHelper(quantity, asciiArt);
    }

}
