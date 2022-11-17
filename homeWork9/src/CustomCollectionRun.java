public class CustomCollectionRun {
    public static void main(String args[]) {
        CustomCollectionImpl list = new CustomCollectionImpl();
        list.add("1");
        list.add("5");
        list.add("4");
        list.print();
        System.out.println("____________________________________________");
        System.out.println(list.delete("5"));
        list.print();
        System.out.println(list.contains("3"));
        System.out.println(list.clear());
        list.print();
        list.add("3");
        list.add("5");
        list.print();
        System.out.println(list.trim());
        System.out.println("______________________________");
        list.print();
        System.out.println(list.size());
        CustomCollectionImpl list1 = new CustomCollectionImpl();
        list1.add("QQ");
        list1.add("WW");
        list1.add("EE");
        list.addAll(list1);
        list.get(0);
        list.print();
    }
}