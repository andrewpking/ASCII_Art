package src;

/**
 * An adorable ASCII Dog to print and customize with words.
 */
public class Dogs extends Ascii {
    private static final String[] asciiArt = {",'.-.'. ",
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

    @Override
    public void fillName(int index, String name) {
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index, name);
        asciiArt[2] = " { " + letter + " }  ";
    }

}
