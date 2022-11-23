package homeWork8.src;

import org.junit.Test;

import static homeWork8.src.OperationsWithListImpl.stringCollection;
import static org.junit.Assert.*;

public class OperationsWithListImplTest {
    private final String o = "A";
    OperationsWithListImpl test = new OperationsWithListImpl();
    private int index = 0;

    @Test
    public void add() {
        test.add(index, o);
        assertTrue("1", stringCollection.length > 0);
        assertEquals("2", o, stringCollection[index]);
    }

    @Test
    public void delete() {
        assertTrue("3", stringCollection.length > 0);
        assertEquals("4", o, stringCollection[index] = o);
        test.delete(o);
        assertNull("5", stringCollection[index]);
    }

    @Test
    public void get() {
        assertTrue("6", index < stringCollection.length);
        assertSame("7", stringCollection[index] = o, test.get(index));
    }

    @Test
    public void contain() {

        assertTrue("8", index < stringCollection.length);
        assertNotNull("9", stringCollection[index] = o);
        assertNotNull("9.1", test.contain(o));
        assertEquals("10", o, stringCollection[index]);
    }

    @Test
    public void testEquals() {
        String[] stringArray = new String[]{"A", "B", "C"};
        assertEquals("11", stringArray.length, stringCollection.length);
        assertNotNull("12", stringArray);
        assertNotNull("13", stringCollection);
        stringCollection[index] = o;
        stringCollection[1] = "B";
        stringCollection[2] = "C";
        assertArrayEquals("14", stringArray, stringCollection);
        assertTrue("15", test.equals(stringArray));
    }

    @Test
    public void clear() {
        test.clear();
        assertNull("16", stringCollection[index]);
    }

    @Test
    public void size() {
        assertEquals("17", o, stringCollection[index] = o);
        assertEquals("18", 1, test.size());
    }

    @Test
    public void next() {

        assertTrue("19", index < stringCollection.length);
        assertEquals("20", o, stringCollection[index] = o);
        assertNull("21", stringCollection[++index] = test.next(index));
    }

    @Test
    public void hasNext() {
        assertTrue("22", test.hasNext(index));
    }

    @Test
    public void remove() {
        assertTrue("23", index < stringCollection.length);
        assertEquals("24", o, stringCollection[index] = o);
        String str = "B";
        assertNotNull("25", stringCollection[++index] = str);
        assertTrue("26", test.remove(o));
    }
}