package src;

import java.io.PrintStream;

public class Dogs implements ASCIIArt{
    private PrintStream print;
    private String dogName;
    private String[] dogs = {",'.-.'. ",
                    "'\\~ o/` ",
                    " { @ }  ",
                    " /`-'\\  ",
                    "(_/-\\_) "};

    /**
     * Creates an ASCII Frog that is printable to the Terminal.
     */
    public Dogs(){
        setAnimalName("@");
        print = System.out;
    }

    /**
     * Creates an ASCII frog with a name that is printable to the Terminal.
     * @param name is the name of the frog.
     */
    public Dogs(String name){
        setAnimalName(name);
        print = System.out;
    }

    /**
     * Creates an ASCII Frog that can be printed to a file.
     * @param print
     */
    public Dogs(PrintStream print){
        setAnimalName("@");
        this.print = print;
    }

    /**
     * Creates an ASCII frog with a name that can be printed to a file.
     * @param print the printstream to the file
     * @param name the name of the frog
     */
    public Dogs(PrintStream print, String name){
        setAnimalName(name);
        this.print = print;
    }

    /**
     * Print each letter of a name on to a frogs tongue.
     * @param index is the index of the letter to be printed.
     */
    private void fillAnimalName(int index){
        // Keep the letter index within bounds of the name.
        int letterIndex = index % dogName.length();
        String letter = dogName.substring(letterIndex, letterIndex + 1);
        dogs[2] = " { " + letter + " }  ";
    }
    @Override
    public int getNameLength() {
        return dogName.length();
    }

    @Override
    public void printAnimals(int quantity) {
        String oldName = dogName;
        setAnimalName("@");
        printAnimalsAndName(quantity);
        dogName = oldName;
    }

    @Override
    public void printAnimalsAndName(int quantity) {
        if(quantity < 1){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < dogs.length; i++){
            for(int j = 0; j < quantity; j++){
                fillAnimalName(j);
                print.print(dogs[i]);
            }
            print.println();
        }
    }

    @Override
    public void setAnimalName(String name) {
        this.dogName = name;
    }
}
