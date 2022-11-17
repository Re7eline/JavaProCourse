
import java.util.Collection;
import java.util.TreeSet;

public class RemoveDuplicates {
    public Collection<String> removeDuplicates(Collection<String> collection) {
        return new TreeSet<>(collection);
    }
}
