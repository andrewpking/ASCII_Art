package src;

/**
 * A collection of operations for generating ASCII clipart.
 */
public interface ASCIIArt {

    /**
     * Print each letter of a name on to art.
     * @param index is the index of the letter to be printed.
     */
    void fillName(int index, String name);

    /**
     * Helper method for putting letters into ASCII Art.
     * @param index the letter to place in the field.
     * @return the letter to be placed in the field as a String.
     */
     String getNameSubstring(int index, String name);

    /**
     * Prints animals across the terminal quantity times.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of ASCII Art to print.
     * @return the StringBuilder containing the resulting art.
     */
     StringBuilder printASCIIArt(int quantity);

    /**
     * Prints duplicates of art with a String iterated accross it.
     * @param name the string to be printed on the ASCII Art.
     * @return the StringBuilder containing the resulting art.
     */
     StringBuilder printASCIIArt(String name);

}

