public class Node {
    public static int counter;
    public int index;
    public String value;
    public Node next;


    public Node(int index, String value) {
        this(value);
        this.index = counter;
        next = null;
    }

    public Node(String value) {
        this.value = value;
    }

}

