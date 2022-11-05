import java.util.Arrays;

public class OperationsWithListImpl implements OperationsWithList {
    private String[] stringCollection = new String[10];
    private String[] stringCollection1;
    private int indexOfCellInArray = 0;

    @Override
    public boolean addToCollection(String parameter) {
        if (indexOfCellInArray < stringCollection.length && stringCollection[indexOfCellInArray] == null) {
            stringCollection[indexOfCellInArray++] = parameter;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            stringCollection = Arrays.copyOf(stringCollection, 15);
            stringCollection[indexOfCellInArray++] = parameter;
            System.out.println(Arrays.toString(stringCollection1));
        }
        return true;
    }

    @Override
    public boolean addToCollectionByIndex(int index, String parameter) {
        index = Math.abs(index);
        if (index < stringCollection.length) {
            stringCollection[index] = parameter;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            stringCollection1[index] = parameter;
            System.out.println(Arrays.toString(stringCollection1));
        }
        return true;
    }

    @Override
    public boolean deleteByIndex(int index) {
        index = Math.abs(index);
        if (index < stringCollection.length && stringCollection[index] != null) {
            stringCollection[index] = null;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            stringCollection1 = Arrays.copyOf(stringCollection, 15);
            stringCollection1[index] = null;
            System.out.println(Arrays.toString(stringCollection1));
        }
        return true;
    }

    @Override
    public boolean deleteByValue(String parameter) {
        for (indexOfCellInArray = 0; indexOfCellInArray < stringCollection.length; indexOfCellInArray++) {
            if (stringCollection[indexOfCellInArray].equals(parameter)) {
                stringCollection[indexOfCellInArray] = null;
                System.out.println(Arrays.toString(stringCollection));
            } else if (indexOfCellInArray > stringCollection.length) {
                stringCollection1 = Arrays.copyOf(stringCollection, 15);
                stringCollection1[indexOfCellInArray].equals(parameter);
                stringCollection1[indexOfCellInArray] = null;
                System.out.println(Arrays.toString(stringCollection1));
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
            System.err.println("Index is too large");
        }
        return chosenIndex;
    }

}