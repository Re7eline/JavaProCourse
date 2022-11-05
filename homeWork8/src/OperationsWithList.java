public interface OperationsWithList {
    boolean addToCollection(String parameter);

    boolean addToCollectionByIndex(int index, String parameter);

    public boolean deleteByIndex(int index);

    public boolean deleteByValue(String parameter);

    String getIndex(int index);
}
