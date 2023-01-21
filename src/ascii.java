package src;

import java.io.PrintStream;

public abstract class ascii implements ASCIIArt {
    private String[] asciiArt;
    private PrintStream print;
    private final String defaultName;

    /**
     * Creates an ASCII graphic that is printable to the Terminal.
     * @param asciiArt the art to be printed.
     * @param defaultName the default character to be printed when a String is not passed.
     */
    public ascii(String[] asciiArt, String defaultName){
        this(System.out, asciiArt, defaultName);
    }

    /**
     * Creates an ASCII that can be printed to a file.
     * @param print the PrintStream pointing to a file.
     * @param asciiArt the art to be printed
     * @param defaultName the default character to be printed when a String is not passed.
     */
    public ascii(PrintStream print, String[] asciiArt, String defaultName){
        this.defaultName = defaultName;
        this.print       = print;
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
    public void printASCIIArt(int quantity) {
        printHelper(quantity, asciiArt, defaultName);
    }

    /**
     * Prints ascii art with the name in its mouth.
     * @param name describes name to print.
     */
    public void printASCIIArt(String name){
        printHelper(name.length(), asciiArt, name);
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

        for(int i = 0; i < asciiArt.length; i++){
            for(int j = 0; j < quantity; j++){
                fillName(j,name);
                print.print(asciiArt[i]);
            }
            print.println();
        }
    }
}
