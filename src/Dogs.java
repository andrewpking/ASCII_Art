package src;

import java.io.PrintStream;

/**
 * An adorable ASCII Dog to print and customize with words.
 */
public class Dogs extends ascii {
    private static String[] asciiArt = {",'.-.'. ",
                    "'\\~ o/` ",
                    " { @ }  ",
                    " /`-'\\  ",
                    "(_/-\\_) "};

    /**
     * Creates an ASCII Dog that is printable to the Terminal.
     */
    public Dogs(){
        super(asciiArt, "@");
    }

    /**
     * Creates an ASCII Dog that can be printed to a file.
     * @param print is a PrintStream that goes to a file.
     */
    public Dogs(PrintStream print){
        super(print,asciiArt, "@");
    }

    @Override
    public void fillName(int index, String name) {
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index, name);
        asciiArt[2] = " { " + letter + " }  ";
    }

}
