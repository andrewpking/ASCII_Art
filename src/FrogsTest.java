package src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FrogsTest {

    private Frogs frog;

    @BeforeEach
    void setUp() {
        frog = new Frogs();
    }

    @Test
    void testFillName() {
        frog.fillName(1, "A");
        StringBuilder expectedArt = new StringBuilder("        _  _        \n" +
                "       (.)(.)       \n" +
                "   ,-.(.____.),-.   \n" +
                "  ( \\ \\ '--' / / )  \n" +
                "   \\ \\ / ,. \\ / /   \n" +
                "    ) '| || |' (    \n" +
                "OoO'- OoO''OoO -'OoO\n");
        StringBuilder actualArt = frog.printASCIIArt(1);
        assertEquals(expectedArt.toString(), actualArt.toString());
    }

    @Test
    public void testPrintASCIIArt() {

        // Test printing with no name
        StringBuilder result1 = frog.printASCIIArt(2);
        String expected1 = "        _  _                _  _        \n" +
                "       (.)(.)              (.)(.)       \n" +
                "   ,-.(.____.),-.      ,-.(.____.),-.   \n" +
                "  ( \\ \\ '--' / / )    ( \\ \\ '--' / / )  \n" +
                "   \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /   \n" +
                "    ) '| || |' (        ) '| || |' (    \n" +
                "OoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoO\n";
        assertEquals(expected1, result1.toString());

        // Test printing with a name
        StringBuilder result2 = frog.printASCIIArt("LILY");
        String expected2 = "        _  _                _  _                _  _                _  _        \n" +
                "       (.)(.)              (.)(.)              (.)(.)              (.)(.)       \n" +
                "   ,-.(._L__.),-.      ,-.(._I__.),-.      ,-.(._L__.),-.      ,-.(._Y__.),-.   \n" +
                "  ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )  \n" +
                "   \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /   \n" +
                "    ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (    \n" +
                "OoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoO\n";
        assertEquals(expected2, result2.toString());

        // Test printing with a longer name
        StringBuilder result3 = frog.printASCIIArt("JIMMYJOHN");
        String expected3 = "        _  _                _  _                _  _                _  _                _  _                _  _                _  _                _  _                _  _        \n" +
                "       (.)(.)              (.)(.)              (.)(.)              (.)(.)              (.)(.)              (.)(.)              (.)(.)              (.)(.)              (.)(.)       \n" +
                "   ,-.(._J__.),-.      ,-.(._I__.),-.      ,-.(._M__.),-.      ,-.(._M__.),-.      ,-.(._Y__.),-.      ,-.(._J__.),-.      ,-.(._O__.),-.      ,-.(._H__.),-.      ,-.(._N__.),-.   \n" +
                "  ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )    ( \\ \\ '--' / / )  \n" +
                "   \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /      \\ \\ / ,. \\ / /   \n" +
                "    ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (        ) '| || |' (    \n" +
                "OoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoOOoO'- OoO''OoO -'OoO\n";
        assertEquals(expected3, result3.toString());
    }

    @Test
    public void testFillNameNegativeIndex() {
        assertThrows(IllegalArgumentException.class, () -> frog.fillName(-1, "A"));
    }

    @Test
    public void testFillNameNullName() {
        assertThrows(IllegalArgumentException.class, () -> frog.fillName(0, null));
    }

}
