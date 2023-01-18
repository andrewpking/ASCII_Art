package src;

import java.io.PrintStream;

public class Dogs extends Animals{
    private final String defaultName = "@";
    private String[] asciiArt = {",'.-.'. ",
                    "'\\~ o/` ",
                    " { @ }  ",
                    " /`-'\\  ",
                    "(_/-\\_) "};

    /**
     * Creates an ASCII Dog that is printable to the Terminal.
     */
    public Dogs(){
        super();
        this.setAnimalName(defaultName);
    }

    /**
     * Creates an ASCII Dog with a name that is printable to the Terminal.
     * @param name is the name of the dog.
     */
    public Dogs(String name){
        super(name);
    }

    /**
     * Creates an ASCII Dog that can be printed to a file.
     * @param print is a PrintStream that goes to a file.
     */
    public Dogs(PrintStream print){
        super(print);
        this.setAnimalName(defaultName);
    }

    /**
     * Creates an ASCII Dog with a name that can be printed to a file.
     * @param print a PrintStream pointing to a file.
     * @param name the name of the dog.
     */
    public Dogs(PrintStream print, String name){
        super(print, name);
    }

    @Override
    public void fillAnimalName(int index){
        // Keep the letter index within bounds of the name.
        String letter = this.getNameSubstring(index);
        asciiArt[2] = " { " + letter + " }  ";
    }


    @Override
    public void printAnimals(int quantity) {
        String oldName = name;
        this.setAnimalName(defaultName);
        this.printAnimalsAndName(quantity);
        name = oldName;
    }

    @Override
    public void printAnimalsAndName(int quantity) {
        this.printHelper(quantity, asciiArt);
    }

}
