package src;

import java.io.PrintStream;

/**
 * An adorable ASCII Frog to print and customize with words.
 */

public class Frogs extends ascii {

    private static String[] asciiArt = {"        _  _        ",
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
        super(asciiArt, "_");
    }

    /**
     * Creates an ASCII Frog that can be printed to a file.
     * @param print the PrintStream pointing to a file.
     */
    public Frogs(PrintStream print){
        super(print, asciiArt, "_");
    }

    @Override
    public void fillName(int index, String name){
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index, name);
        asciiArt[2] = "   ,-.(._" + letter + "__.),-.   ";
    }

}
