public class CollectionsMain {
    public static void main(String[] args) {
        OperationsWithList actions = new OperationsWithList();
        actions.addToCollection("1");
        actions.addToCollection("2");
        actions.addToCollection("3");
        actions.addToCollection("4");
        actions.addToCollection("5");
        actions.addToCollection("6");
        actions.addToCollection("7");
        actions.addToCollection("8");
        actions.addToCollection("9");
        actions.addToCollection("10");
        actions.addToCollection("11");
        actions.getIndex(6);
        actions.addToCollectionByIndex(11, "12");
        actions.deleteByIndex(11);
        actions.deleteByValue("2");
    }
}
