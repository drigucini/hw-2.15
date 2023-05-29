public class StringListArray implements StringList {
private String[] arrayString;
private int size;

    public StringListArray() {
        arrayString = new String[10];
    }
    public StringListArray(int size) {
        arrayString = new String[size];
    }

    @Override
    public String add(String item) {
        return null;
    }

    @Override
    public String add(int index, String item) throws IndexOutOfBoundsException {
        if (index < arrayString.length) {
            arrayString[index] = item;
            return arrayString[index];
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < arrayString.length - 1; i++) {
            if (arrayString[i].equals(item)) {
                remove(item);
            }
        }
        return item;
    }

    @Override
    public String remove(int index) {
        String item = arrayString[index];
        remove(arrayString[index]);
        return item;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < arrayString.length - 1; i++) {
            if (arrayString[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = arrayString.length - 1; i >= 0; i++) {
            if (arrayString[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) throws IndexOutOfBoundsException {
        if (index < arrayString.length - 1) {
            return arrayString[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }


    public void validateItem (String item ) {
        item = "0";
    }
    public void validateSize (int size) {
        size = 0;
    }
}
