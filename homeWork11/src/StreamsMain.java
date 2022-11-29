import java.util.Arrays;
import java.util.List;


public class StreamsMain {

    public static void main(String[] args) {
        /** 1 */
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(CalculateAverage.getAverage(integerList));
        System.out.println("___________________________________________");

        /** 2 */
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
        Pair pair = new Pair();
        System.out.println(pair.createPair(stringList));
        System.out.println("___________________________________________");

        /** 3 */
        System.out.println(pair.filtration(stringList));

    }
}

