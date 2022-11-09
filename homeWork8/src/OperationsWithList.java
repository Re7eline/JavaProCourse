public interface OperationsWithList {
    boolean add(String parameter);

    boolean add(int index, String o);

    boolean delete(String o);

    String get(int index);

    boolean contain(String o);

    boolean equals(String[] stringArray);

    boolean clear();

    int size();
}
