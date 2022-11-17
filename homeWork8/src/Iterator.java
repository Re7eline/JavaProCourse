public interface Iterator<E> {
    String next(int index);

    boolean hasNext(int index);

    boolean remove(String o);
}
