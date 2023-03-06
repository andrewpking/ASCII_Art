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
     * Creates an ASCII Dog that can be output to a StringBuilder.
     */
    public Dogs(){
        super(asciiArt, "@");
    }

    @Override
    public void fillName(int index, String name) {
        if(index < 0){
            throw new IllegalArgumentException("Index must be positive.");
        }
        if(name == null){
            throw new IllegalArgumentException("Name must not be null.");
        }
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index, name);
        asciiArt[2] = " { " + letter + " }  ";
    }

}
