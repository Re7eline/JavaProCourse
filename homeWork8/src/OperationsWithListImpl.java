import java.util.Arrays;

public class OperationsWithListImpl implements OperationsWithList {
    private static String[] stringCollection = new String[6];
    private int indexOfCellInArray = 0;

    @Override
    public boolean add(String parameter) {
        if (indexOfCellInArray >= stringCollection.length || stringCollection[indexOfCellInArray] != null) {
            extendArraySize(stringCollection, indexOfCellInArray);
        }
        add(indexOfCellInArray++, parameter);
//        stringCollection[indexOfCellInArray++] = parameter;
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
        if (stringCollection[indexOfCellInArray].equals(o)) {
            return delete(indexOfCellInArray);
        } else System.out.println("Here is nothing to delete");
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
//        return Arrays.asList(stringCollection).contains(o);
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
//        return Arrays.equals(stringArray, stringCollection);
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
        if (index < stringCollection.length && stringCollection[index] != null) {
            stringCollection[index] = null;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            System.out.println("Here is nothing to delete");
        }
        return true;
    }

    private String[] extendArraySize(String[] stringArray, int index) {
        String[] temp = stringCollection.clone();
        stringCollection = new String[index + 5];
        System.arraycopy(temp, 0, stringCollection, 0, temp.length);
        return stringCollection;
    }
}