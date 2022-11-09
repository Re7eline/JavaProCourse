public class CollectionsMain {
    public static void main(String[] args) {
        OperationsWithListImpl actions = new OperationsWithListImpl();
        actions.add("1");
        actions.add("4");
        actions.add("7");
        actions.add("9");
        actions.get(6);
        actions.add(4, "3");
        actions.delete("2");
        System.out.println(actions.equals(new String[]{"1", "4", "7", "9", "3"}));
        actions.size();
        System.out.println(actions.contain("6"));
        System.out.println(actions.clear());
    }
}
