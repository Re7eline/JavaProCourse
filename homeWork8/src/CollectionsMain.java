public class CollectionsMain {
    public static void main(String[] args) {
        OperationsWithListImpl actions = new OperationsWithListImpl();
        actions.addToCollection("1");
        actions.addToCollection("4");
        actions.addToCollection("7");
        actions.addToCollection("9");
        actions.getIndex(6);
        actions.addToCollectionByIndex(4, "3");
        actions.deleteByIndex(6);
        actions.deleteByValue("2");
        System.out.println(actions.equals(new String[]{"1", "4", "7", "9", "3"}));
        actions.size();
        System.out.println(actions.contain("6"));
        actions.clear();
    }
}
