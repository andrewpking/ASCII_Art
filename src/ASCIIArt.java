package src;

public interface ASCIIArt {
    /**
     * Prints animals across the terminal quantity times.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of animals to print
     */
    void printAnimals(int quantity);

    /**
     * Prints animals across the terminal quantity times with the
     * name of the animal in its mouth.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of animals to print
     */
    void printAnimalsAndName(int quantity);

    /**
     * Assign a name to the animal.
     * @param name is the animals name.
     */
    void setAnimalName(String name);
}

