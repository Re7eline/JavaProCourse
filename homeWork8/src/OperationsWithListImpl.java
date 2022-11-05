import java.util.Arrays;

public class OperationsWithListImpl implements OperationsWithList {
    private static String[] stringCollection = new String[10];
    private int indexOfCellInArray = 0;

    private static String[] extendArraySize(String[] stringArray, int index) {
        String[] temp = stringCollection.clone();
        stringCollection = new String[index + 1];
        System.arraycopy(temp, 0, stringCollection, 0, temp.length);
        return stringCollection;
    }

    @Override
    public boolean addToCollection(String parameter) {
        if (indexOfCellInArray >= stringCollection.length || stringCollection[indexOfCellInArray] != null) {
            extendArraySize(stringCollection, indexOfCellInArray);
        }
        addToCollectionByIndex(indexOfCellInArray++, parameter);
//        stringCollection[indexOfCellInArray++] = parameter;
        return true;
    }

    @Override
    public boolean addToCollectionByIndex(int index, String parameter) {
        index = Math.abs(index);
        if (index >= stringCollection.length) {
            extendArraySize(stringCollection, index);
        }
        stringCollection[index] = parameter;
        System.out.println(Arrays.toString(stringCollection));
        return true;
    }

    @Override
    public boolean deleteByIndex(int index) {
        index = Math.abs(index);
        if (index < stringCollection.length && stringCollection[index] != null) {
            stringCollection[index] = null;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            System.err.println("Here is nothing to delete");
        }
        return true;
    }

    @Override
    public boolean deleteByValue(String parameter) {
        for (indexOfCellInArray = 0; indexOfCellInArray < stringCollection.length; indexOfCellInArray++) {
            if (stringCollection[indexOfCellInArray].equals(parameter)) {
                deleteByIndex(indexOfCellInArray);
                break;
            }
        }
        return true;
    }

    @Override
    public String getIndex(int index) {
        index = Math.abs(index);
        String chosenIndex = "";
        if (index < stringCollection.length) {
            chosenIndex = stringCollection[index];
            System.out.println(chosenIndex);
        } else {
            System.err.println("Here is nothing");
        }
        return chosenIndex;
    }
}