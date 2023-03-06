package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogsTest {

    @Test
    public void testDefaultConstructor() {
        Dogs dogs = new Dogs();
        StringBuilder expectedOutput = new StringBuilder(
                ",'.-.'. ,'.-.'. ,'.-.'. \n" +
                        "'\\~ o/` '\\~ o/` '\\~ o/` \n" +
                        " { @ }   { @ }   { @ }  \n" +
                        " /`-'\\   /`-'\\   /`-'\\  \n" +
                        "(_/-\\_) (_/-\\_) (_/-\\_) \n"
        );
        StringBuilder actualOutput = dogs.printASCIIArt(3);
        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void testFillName() {
        Dogs dogs = new Dogs();
        // Fill name does not mutate the dogs object.
        dogs.fillName(0, "Penny");
        StringBuilder expectedOutput = new StringBuilder(
                        ",'.-.'. \n" +
                        "'\\~ o/` \n" +
                        " { @ }  \n" +
                        " /`-'\\  \n" +
                        "(_/-\\_) \n"
        );
        StringBuilder actualOutput = dogs.printASCIIArt(1);
        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void testFillNameWithIndexOutOfBounds() {
        Dogs dogs = new Dogs();
        assertThrows(IllegalArgumentException.class, () -> {
            dogs.fillName(-1, "Penny");
        });
    }

    @Test
    public void testFillNameWithNameNull() {
        Dogs dogs = new Dogs();
        assertThrows(IllegalArgumentException.class, () -> {
            dogs.fillName(0, null);
        });
    }

    @Test
    public void testPrintASCIIArtWithName() {
        Dogs dogs = new Dogs();
        StringBuilder expectedOutput = new StringBuilder(
                ",'.-.'. \n" +
                        "'\\~ o/` \n" +
                        " { M }  \n" +
                        " /`-'\\  \n" +
                        "(_/-\\_) \n"
        );
        StringBuilder actualOutput = dogs.printASCIIArt("M");
        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

}
