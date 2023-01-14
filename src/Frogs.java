package src;

public class Frogs {
    private String frogName;
    private String[] frog = {"        _  _        ",
                     "       (.)(.)       ",
                     "   ,-.(.____.),-.   ",
                     "  ( \\ \\ '--' / / )  ",
                     "   \\ \\ / ,. \\ / /   ",
                     "    ) '| || |' (    ",
                     "OoO'- OoO''OoO -'OoO"};

    /**
     * Creates an ASCII Frog that is printable.
     */
    public Frogs(){
        frogName = "_";
    }

    /**
     * Creates an ASCII frog with a name that is printable
     * @param name is the name of the frog.
     */
    public Frogs(String name){
        setFrogName(name);
    }

    /**
     * Prints frogs across the terminal quantity times.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of frogs to print
     */
    public void printFrogs(int quantity){
        String oldName = frogName;
        frogName = "_";
        printFrogAndName(quantity);
        frogName = oldName;
    }

    /**
     * Prints frogs across the terminal quantity times with the
     * name of the frog in its mouth.
     * @throws IllegalArgumentException if size < 1.
     * @param quantity describes number of frogs to print
     */
    public void printFrogAndName(int quantity){
        if(quantity < 1){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < frog.length; i++){
            for(int j = 0; j < quantity; j++){
                fillFrogName(j);
                System.out.print(frog[i]);
            }
            System.out.println();
        }
    }

    /**
     * Assign a name to the frog.
     * @param name is the frogs name.
     */
    public void setFrogName(String name){
        frogName = name;
    }

    /**
     * Print each letter of a name on to a frogs tongue.
     * @param index is the index of the letter to be printed.
     */
    private void fillFrogName(int index){
        // Keep the letter index within bounds of the name.
        int letterIndex = index % frogName.length();
        String letter = frogName.substring(letterIndex, letterIndex + 1);
        frog[2] = "   ,-.(._" + letter + "__.),-.   ";
    }
}
