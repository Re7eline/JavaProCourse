public class CustomCollectionImpl implements CustomCollection {
    public static Node stringNode;

    private static int counter;
    private Node head;

    public CustomCollectionImpl() {
        head = null;
    }

    public Node newNode(String s) {
        stringNode = new Node(counter, s);
        counter++;
        return stringNode;
    }

    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.value);
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                System.out.println(currentNode.value);
            }
        } else {
            System.out.println("Nothing to print");
        }
    }

    @Override
    public boolean addAll(CustomCollectionImpl strColl) {
        if (strColl == null) {
            return false;
        }
        if (head == null) {
            head = strColl.head;
            return true;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = strColl.head;
        return true;
    }

    @Override
    public boolean add(String str) {
        newNode(str);
        Node currentNode = head;

        if (head == null) {
            head = stringNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = stringNode;
        }
        return true;
    }


    @Override
    public boolean delete(int index) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.index != index) {
            if (currentNode.next == null)
                System.out.println("Nothing here");
            else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        if (currentNode == head)
            head = head.next;
        else
            previousNode.next = currentNode.next;
        return true;
    }

    @Override
    public boolean delete(String str) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
            if (currentNode.value == str) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return true;
    }

    @Override
    public String get(int index) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.index == index) {
                System.out.println("Founded element: " + currentNode.value);
                break;
            } else if (currentNode.next == null) {
                System.out.println("Nothing founded");
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
        return currentNode.value;
    }

    @Override
    public boolean contains(String str) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(str)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = null;
        counter = 0;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean trim() {
        Node currentNode = head;
        return (currentNode == null || counter == 0);
    }


}

