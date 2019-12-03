package JM_Generics;

import java.util.Arrays;

public class Task_6_1_13 {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>();
        arr.add("a");
        System.out.println(arr.getLength());
        arr.remove(4);
        System.out.println(arr.getLength());
    }
}
class DynamicArray<T> {
    private T[] internalArray = (T[]) new Object[10];
    private int elementsInArray = 0;
    public DynamicArray() {}

    public void add(T el) {
        if (elementsInArray == internalArray.length) {
            internalArray = Arrays.copyOf(internalArray, internalArray.length*2);
        }
        internalArray[elementsInArray] = el;
        elementsInArray++;
    }

    public void remove(int index) {

            System.arraycopy(internalArray, index + 1, internalArray, index, internalArray.length - 1 - index);
    }

    public T get(int index) {
        return (T) internalArray[index];
    }

    public int getLength() {
        return internalArray.length;
    }
}
