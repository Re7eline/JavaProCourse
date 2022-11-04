import java.util.Arrays;

public class OperationsWithList {
    private String[] stringCollection = new String[10];
    private String[] stringCollection1;
    private int i = 0;

    public boolean addToCollection(String parameter) {
        if (i < stringCollection.length && stringCollection[i] == null) {
            stringCollection[i++] = parameter;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            stringCollection1 = Arrays.copyOf(stringCollection, 15);
            stringCollection1[i++] = parameter;
            System.out.println(Arrays.toString(stringCollection1));
        }
        return true;
    }

    public boolean addToCollectionByIndex(int index, String parameter) {
        if (index < stringCollection.length) {
            stringCollection[index] = parameter;
            System.out.println(Arrays.toString(stringCollection));
        } else {
            stringCollection1[index] = parameter;
            System.out.println(Arrays.toString(stringCollection1));
        }
        return true;
    }

    public boolean deleteByIndex(int index) {
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

    public boolean deleteByValue(String parameter) {
        for (i = 0; i < stringCollection.length; i++) {
            if (stringCollection[i].equals(parameter)) {
                stringCollection[i] = null;
                System.out.println(Arrays.toString(stringCollection));
            } else if (i > stringCollection.length) {
                stringCollection1 = Arrays.copyOf(stringCollection, 15);
                stringCollection1[i].equals(parameter);
                stringCollection1[i] = null;
                System.out.println(Arrays.toString(stringCollection1));
            }
        }
        return true;
    }

    public String getIndex(int index) {
        String chosenIndex = stringCollection[index];
        System.out.println(chosenIndex);
        return chosenIndex;
    }
}

