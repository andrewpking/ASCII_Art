package src;

public abstract class Ascii implements ASCIIArt {
    private final String[] asciiArt;
    private StringBuilder artString;
    private final String defaultName;

    /**
     * Creates an ASCII object that can be constructed as a string builder.
     * @param asciiArt the art to be printed
     * @param defaultName the default character to be printed when a String is not passed.
     */
    public Ascii(String[] asciiArt, String defaultName){
        this.defaultName = defaultName;
        this.artString   = new StringBuilder();
        this.asciiArt    = asciiArt;
    }

    /**
     * Print each letter of a name onto art.
     * @param index is the index of the letter to be printed.
     * @param name is the name to be filled into the art.
     */
    public abstract void fillName(int index, String name);

    /**
     * Helper method for putting letters into ASCII Art.
     * @param index the letter to place in the field.
     * @return the letter to be placed in the field as a String.
     */
    public String getNameSubstring(int index, String name){
        int letterIndex = index % name.length();
        return name.substring(letterIndex, letterIndex + 1);
    }

    /**
     * Prints art across the terminal quantity times.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of animals to print.
     */
    public StringBuilder printASCIIArt(int quantity) {
        printHelper(quantity, asciiArt, defaultName);
        String result = artString.toString();
        printHelper(1, asciiArt, defaultName);
        return new StringBuilder(result);
    }

    /**
     * Prints ascii art with the name in its mouth.
     * @param name describes name to print.
     * @return the StringBuilder containing the resulting art.
     */
    public StringBuilder printASCIIArt(String name){
        printHelper(name.length(), asciiArt, name);
        String result = artString.toString();
        printHelper(1, asciiArt, defaultName);
        return new StringBuilder(result);
    }

    /**
     * Prints ASCII Art quantity times
     * @param quantity of times to print.
     * @throws IllegalArgumentException if size < 0.
     * @param asciiArt is the artwork to print as a String Array.
     */
    public void printHelper(int quantity, String[] asciiArt, String name){
        if(quantity < 0){
            throw new IllegalArgumentException();
        }

        artString = new StringBuilder();

        for (String s : asciiArt) {
            for (int j = 0; j < quantity; j++) {
                fillName(j, name);
                artString.append(s);
            }
            artString.append('\n');
        }
    }
}
