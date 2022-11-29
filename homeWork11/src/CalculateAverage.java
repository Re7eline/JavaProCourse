import java.util.List;

public class CalculateAverage {
    public static double getAverage(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
}
