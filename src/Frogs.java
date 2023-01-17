package src;

import java.io.PrintStream;

public class Frogs implements ASCIIArt {
    private PrintStream print;
    private String frogName;
    private String[] frog = {"        _  _        ",
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
        setAnimalName("_");
        print = System.out;
    }

    /**
     * Creates an ASCII frog with a name that is printable to the Terminal.
     * @param name is the name of the frog.
     */
    public Frogs(String name){
        setAnimalName(name);
        print = System.out;
    }

    /**
     * Creates an ASCII Frog that can be printed to a file.
     * @param print
     */
    public Frogs(PrintStream print){
        setAnimalName("_");
        this.print = print;
    }

    /**
     * Creates an ASCII frog with a name that can be printed to a file.
     * @param print the printstream to the file
     * @param name the name of the frog
     */
    public Frogs(PrintStream print, String name){
        setAnimalName(name);
        this.print = print;
    }

    /**
     * @return length of the frogs name.
     */
    @Override
    public int getNameLength(){
        return this.frogName.length();
    }

    /**
     * Print each letter of a name on to a frogs tongue.
     * @param index is the index of the letter to be printed.
     */
    private void fillAnimalName(int index){
        // Keep the letter index within bounds of the name.
        int letterIndex = index % frogName.length();
        String letter = frogName.substring(letterIndex, letterIndex + 1);
        frog[2] = "   ,-.(._" + letter + "__.),-.   ";
    }

    @Override
    public void printAnimals(int quantity){
        String oldName = frogName;
        frogName = "_";
        printAnimalsAndName(quantity);
        frogName = oldName;
    }

    /**
     * Prints frogs across the terminal quantity times with the
     * name of the frog in its mouth.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of frogs to print
     */
    @Override
    public void printAnimalsAndName(int quantity){
        if(quantity < 1){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < frog.length; i++){
            for(int j = 0; j < quantity; j++){
                fillAnimalName(j);
                print.print(frog[i]);
            }
            print.println();
        }
    }

    /**
     * Assign a name to the frog.
     * @param name is the frogs name.
     */
    @Override
    public void setAnimalName(String name){
        frogName = name;
    }

}
