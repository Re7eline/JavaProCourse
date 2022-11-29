package homeWork11.src;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PairTest {

    @Test
    public void createPair() {
        List<String> stringList = Arrays.asList("dog", null, "cat");
        Pair pair = new Pair();
        List<Pair> pairList = pair.createPair(stringList);
        assertEquals("1", 2, pairList.size());
        assertEquals("2", "cat", pairList.get(1).getlCase());
        assertEquals("3", "CAT", pairList.get(1).getuCase());
    }

    @Test
    public void filtration() {
        List<String> stringList = Arrays.asList("five", "dog", "cat", "ANIMAL", "human", "Five");
        Pair pair = new Pair();
        pair.filtration(stringList);
        assertEquals("4", 6, stringList.size());
        assertEquals("5 ", "five", pair.filtration(stringList).get(0));

    }
}