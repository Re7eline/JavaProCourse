public class CollectionsMain {
    public static void main(String[] args) {
        OperationsWithListImpl actions = new OperationsWithListImpl();
        actions.add("1");
        actions.add("4");
        actions.add("7");
        actions.add("9");
        actions.add("13");
        System.out.println("This cell have next: "+actions.hasNext(2));
        System.out.println(actions.next(3));
        System.out.println(actions.remove("1"));

    }
}
