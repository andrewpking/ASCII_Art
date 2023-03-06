package src;

/**
 * An adorable ASCII Frog to print and customize with words.
 */

public class Frogs extends Ascii {

    private static final String[] asciiArt = {"        _  _        ",
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

    @Override
    public void fillName(int index, String name){
        if(index < 0){
            throw new IllegalArgumentException("Index must be positive.");
        }
        if(name == null){
            throw new IllegalArgumentException("Name must not be null.");
        }
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index, name);
        asciiArt[2] = "   ,-.(._" + letter + "__.),-.   ";
    }

}
