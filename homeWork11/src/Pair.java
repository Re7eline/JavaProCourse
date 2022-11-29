import java.util.List;
import java.util.Objects;

public class Pair {
    private String lCase;
    private String uCase;

    public Pair() {
    }

    public Pair(String lCase, String uCase) {
        this.lCase = lCase;
        this.uCase = uCase;
    }

    public List<Pair> createPair(List<String> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(w -> new Pair(w, w.toUpperCase()))
                .toList();
    }

    public List<String> filtration(List<String> list) {
        int wordLength = 4;
        List<String> filtraded = list.stream()
                .filter(s -> s.length() == wordLength)
                .filter(s -> s.equals(s.toLowerCase())).toList();
        return filtraded;
    }

//    public void execute(List<String> list) {
//        List<String> stringListMapped =
//                list.stream()
//                        .map(String::toUpperCase).toList();
//        list.stream()
//                .flatMap(f -> stringListMapped
//                        .stream()
//                        .filter(f::equalsIgnoreCase)
//                        .map(s -> String.format("%s,%s ", f, s)))
//                .forEach(System.out::println);
//    }

    public String getlCase() {
        return lCase;
    }

    public void setlCase(String lCase) {
        this.lCase = lCase;
    }

    public String getuCase() {
        return uCase;
    }

    public void setuCase(String uCase) {
        this.uCase = uCase;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "lCase='" + lCase + '\'' +
                ", uCase='" + uCase + '\'' +
                '}';
    }
}
