package homeWork11.src;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalculateAverageTest {

    @Test
    public void getAverage() {
        List<Integer> integerList = Arrays.asList(4, 6);
        double calculated = CalculateAverage.getAverage(integerList);
        assertNotNull("1", integerList);
        assertEquals("2", 2, integerList.size());
        assertEquals("3",5, calculated, 0.0);
    }
}