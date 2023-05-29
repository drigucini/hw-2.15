import java.util.ArrayList;
import java.util.Arrays;

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
        validateSize();
        validateItem(item);
        arrayString[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item){
        validateItem(item);
        validateIndex(index);
        validateSize();

        if (index == size) {
            arrayString[size++] = item;
            return item;
        }
        System.arraycopy(arrayString, index, arrayString, index + 1, size - index);
        size++;
        arrayString[index] = item;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateItem(item);
        validateIndex(index);
        arrayString[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        int index = indexOf(item);

        return remove(index);
    }

    @Override
    public String remove(int index) {
        validateIndex(index);

        String item = arrayString[index];

        if (index != size) {
            System.arraycopy(arrayString, index + 1, arrayString, index, size - index);
        }

        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        validateItem(item);
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        validateItem(item);
        for (int i = 0; i < size; i++) {
            if (arrayString[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        validateItem(item);
        for (int i = size - 1; i >= 0; i--) {
            if (arrayString[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return arrayString[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(arrayString, size);
    }


    private void validateItem (String item ) {
        if (item == null) {
            throw new NullItemException();
        }
    }
    private void validateSize () {
        if (size >= arrayString.length) {
            throw new StorageIsFullExceptio();
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException();
        }
    }
}
