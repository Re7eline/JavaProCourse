package homeWork8.src;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsWithListImplTest {
    private String[] stringCollection = new String[3];
    private final String[] stringArray = new String[]{"A", "B", "C"};
    private final String o = "A";
    private final String str = "B";
    private int index = 0;

    @Test
    public void add() {
        assertTrue("1", stringCollection.length > 0);
        assertEquals("2", "A", stringCollection[index] = o);
    }

    @Test
    public void delete() {
        assertTrue("3", stringCollection.length > 0);
        assertEquals("4", o, stringCollection[index] = o);
        stringCollection[index] = null;
        assertNull("5", stringCollection[index]);
    }

    @Test
    public void get() {
        assertTrue("6", index < stringCollection.length);
        assertSame("7", o, stringCollection[index] = o);
    }

    @Test
    public void contain() {
        assertTrue("8", index < stringCollection.length);
        assertNotNull("9", stringCollection[index] = o);
        assertEquals("10", o, stringCollection[index] = o);
    }

    @Test
    public void testEquals() {

        assertEquals("11", stringArray.length, stringCollection.length);
        assertNotNull("12", stringArray);
        assertNotNull("13", stringCollection);
        stringCollection[index] = o;
        stringCollection[1] = "B";
        stringCollection[2] = "C";
        assertArrayEquals("14", stringArray, stringCollection);
    }

    @Test
    public void clear() {
        stringCollection = new String[5];
        assertEquals("15", 5, stringCollection.length);
        assertNull("16", stringCollection[index]);
    }

    @Test
    public void size() {
        assertEquals("17", o, stringCollection[index] = o);
        int count = 0;
        for (String s : stringCollection) {
            if (s != null) {
                count++;
            }
        }
        assertEquals("18", 1, count);
    }

    @Test
    public void next() {
        assertTrue("19", index < stringCollection.length);
        assertEquals("20", o, stringCollection[index] = o);
        assertEquals("21", str, stringCollection[++index] = str);
    }

    @Test
    public void hasNext() {
        assertTrue("22", index < stringCollection.length);
    }

    @Test
    public void remove() {
        assertTrue("23", index < stringCollection.length);
        assertEquals("24", o, stringCollection[index] = o);
        assertNotNull("25", stringCollection[++index] = str);

    }
}