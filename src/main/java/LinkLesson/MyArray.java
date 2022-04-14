package LinkLesson;

import java.util.Arrays;

public class MyArray<E> {

    final int ARRAY_CAPACITY = 10;
    int size;
    Object[] element;

    public MyArray() {
        this.element = new Object[ARRAY_CAPACITY];
    }

    public void add(E e) {

        if (size < element.length) {
            element[size++] = e;
        } else {
            element = addLengthToArray();
            add(e);
        }

    }

    public void add(E e, int index) {

        if (size + 1 < element.length) {
            Object[] newArray = new Object[element.length];
            for (int i = 0; i < element.length; i++) {
                if (index > i) {
                    newArray[i] = element[i];
                } else if (index == i) {
                    newArray[i] = e;
                    size++;
                } else {
                    newArray[i] = element[i - 1];
                }
            }
            element = newArray;
        } else {
            element = addLengthToArray();
            add(e);
        }

    }

    public Object[] addLengthToArray() {
        Object[] newArray = new Object[element.length + 10];
        System.arraycopy(element, 0, newArray, 0, element.length);
        return newArray;
    }

    public void clear() {
        element = new Object[ARRAY_CAPACITY];
    }

    public Object get(int index) {

        Object value;
        try {
            value = element[index];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new MyCustomException(index);
        }

        if (index <= 0 || index > element.length){
            throw new MyCustomException(index);
        }

        return value;

    }

    public int indexOf(E value) {
        return Arrays.asList(element).indexOf(value);
    }

    public void set(E value, int index) throws Exception {
        try {
            element[index] = value;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("try different index");
        }
    }

    public void remove(E e){
        int index = indexOf(e);

        if (index <= 0 || index > element.length){
            throw new MyCustomException(index);
        }

        System.arraycopy(element, index + 1, element, index, element.length - 1);
        size--;

    }


}
