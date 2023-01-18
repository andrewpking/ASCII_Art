package src;

import java.io.PrintStream;

public abstract class Animals implements ASCIIArt {
    private PrintStream print;
    private String defaultName;
    private String name;

    /**
     * Creates an ASCII Animal with a name that is printable to the Terminal.
     * @param name is the name of the Animal.
     */
    public Animals(String name, String defaultName){
        this.setAnimalName(name);
        this.defaultName = defaultName;
        this.print = System.out;
    }

    /**
     * Creates an ASCII Animal with a name that can be printed to a file.
     * @param print the PrintStream pointing to a file.
     * @param name the name of the Animal.
     */
    public Animals(PrintStream print, String name, String defaultName){
        this.setAnimalName(name);
        this.defaultName = defaultName;
        this.print = print;
    }

    /**
     * Print each letter of a name on to art.
     * @param index is the index of the letter to be printed.
     */
    public abstract void fillAnimalName(int index);

    /**
     * @return length of the animals name.
     */
    public int getNameLength() {
        return name.length();
    }

    /**
     * Helper method for putting letters into ASCII Art.
     * @param index the letter to place in the field.
     * @return the letter to be placed in the field as a String.
     */
    public String getNameSubstring(int index){
        int letterIndex = index % name.length();
        return name.substring(letterIndex, letterIndex + 1);
    }

    /**
     * Prints animals across the terminal quantity times.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of animals to print.
     */
    public void printAnimals(int quantity) {
        String oldName = name;
        this.setAnimalName(defaultName);
        this.printAnimalsAndName(quantity);
        name = oldName;
    }

    /**
     * Prints animals quantity times with the
     * name of the animal in its mouth.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of animals to print.
     */
    public abstract void printAnimalsAndName(int quantity);

    /**
     * Prints ASCII Art quantity times
     * @param quantity of times to print.
     * @param asciiArt is the artwork to print as a String Array.
     */
    public void printHelper(int quantity, String[] asciiArt){
        if(quantity < 1){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < asciiArt.length; i++){
            for(int j = 0; j < quantity; j++){
                fillAnimalName(j);
                print.print(asciiArt[i]);
            }
            print.println();
        }
    }

    /**
     * Assign a name to the animal.
     * @param name is the animals name.
     */
    public void setAnimalName(String name) {
        this.name = name;
    }
}
