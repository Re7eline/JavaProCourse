import java.util.Arrays;
import java.util.Objects;

public class OperationsWithListImpl implements OperationsWithList, Iterator {
    private static String[] stringCollection = new String[6];
    private int indexOfCellInArray = 0;

    @Override
    public boolean add(String parameter) {
        if (indexOfCellInArray >= stringCollection.length || stringCollection[indexOfCellInArray] != null) {
            extendArraySize(stringCollection, indexOfCellInArray);
        }
        add(indexOfCellInArray++, parameter);
//        stringNode[indexOfCellInArray++] = parameter;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        index = Math.abs(index);
        if (index >= stringCollection.length) {
            extendArraySize(stringCollection, index);
        }
        stringCollection[index] = o;
        System.out.println(Arrays.toString(stringCollection));
        return true;
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < stringCollection.length; i++)
            if (Objects.equals(stringCollection[i], o)) {
                delete(i);
                return true;
            }
        return false;
    }

    @Override
    public String get(int index) {
        index = Math.abs(index);
        String chosenIndex = "";
        if (index < stringCollection.length) {
            chosenIndex = stringCollection[index];
            System.out.println(chosenIndex);
        } else {
            System.out.println("Here is nothing");
        }
        return chosenIndex;
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < stringCollection.length; i++) {
            if (stringCollection[i] != null && stringCollection[i].equals(o)) {
                return true;
            }
        }
//        return Arrays.asList(stringNode).contains(o);
        return false;
    }

    @Override
    public boolean equals(String[] stringArray) {
        if (stringArray.length == stringCollection.length && stringArray != null || stringCollection != null) {
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < stringCollection.length; j++) {
                    if (stringArray[i].equals(stringCollection[j])) {
                        return true;
                    }
                }
            }
        }
//        return Arrays.equals(stringArray, stringNode);
        return false;
    }

    @Override
    public boolean clear() {
        stringCollection = new String[5];
        return true;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < stringCollection.length; i++) {
            if (stringCollection[i] != null) {
                count++;
            }
        }
        System.out.println("Size of array: " + count);
        return count;
    }

    private boolean delete(int index) {
        index = Math.abs(index);
        if (index < stringCollection.length) {
            stringCollection[index] = null;
            System.out.println(Arrays.toString(stringCollection));
        }
        return true;
    }

    private String[] extendArraySize(String[] stringArray, int index) {
        String[] temp = stringCollection.clone();
        stringCollection = new String[index + 5];
        System.arraycopy(temp, 0, stringCollection, 0, temp.length);
        return stringCollection;
    }

    @Override
    public String next(int index) {
        index = Math.abs(index);
        String current = null;
        String next = null;
        if (hasNext(index)) {
            current = stringCollection[index];
            next = stringCollection[++index];
        }
        return "current: " + current + " next: " + next;
    }

    @Override
    public boolean hasNext(int index) {
        index = Math.abs(index);
        return index < stringCollection.length;
    }

    @Override
    public boolean remove(String o) {
        for (int i = 0; i < stringCollection.length; i++) {
            if (hasNext(i) == contain(o)) {
                delete(o);
                return true;
            }
        }
        return false;
    }
}