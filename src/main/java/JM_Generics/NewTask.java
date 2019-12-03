//package Generics;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class NewTask {
//    public static void main(String[] args) {
//        Integer[] myArray = new Integer[]{};
//        DynamicArray<Integer> arr = new DynamicArray<Integer>(myArray);
//        System.out.println("Создали пустой массив нулевой длины:" + arr.sizeArray);
//        System.out.println("Добавляем в него 10 элементов");
//        Random rnd = new Random(System.currentTimeMillis());
//        for (int i = 0; i < 10; i++) {
//            arr.add(rnd.nextInt(1000));
//        }
//        arr.printDynamicArray(arr);
//        System.out.println("Удаляем 2,4,6 элементы");
//        arr.remove(2);
//        arr.remove(4);
//        arr.remove(6);
//        arr.printDynamicArray(arr);
//​
//        System.out.println("Выводим элемент 2: " + arr.get(2));
//    }
//​
//    public static class DynamicArray<T> {
//        private T[] dynamicArray;
//        int sizeArray = 0;
//        int firstNotNullEllement = -1;
//​
//        public DynamicArray() {
//            this.dynamicArray = (T[]) new Object[sizeArray];
//        }
//​
//        public DynamicArray(T[] array) {
//            this.dynamicArray = array;
//        }
//​
//        public DynamicArray(int size) {
//            this.sizeArray = sizeArray;
//            this.dynamicArray = (T[]) new Object[size];
//        }
//​
//        public int getSizeArray(DynamicArray<T> arr) {
//            return this.dynamicArray.length;
//        }
//​
//        public int getFirstNotNullEllement(T[] dynamicArray) {
//            for (int i = 0; i < dynamicArray.length; i++) {
//                if (dynamicArray[i] == null) {
//                    this.firstNotNullEllement = i;
//                    return i;
//                }
//            }
//            return -1;
//        }
//​
//        public T[] increaseSize(T[] dynamicArray) {
//            int s = dynamicArray.length + 1;
//            dynamicArray = Arrays.copyOf(dynamicArray, s);
//​
//            return dynamicArray;
//        }
//​
//        public void add(T el) {
//            while (getFirstNotNullEllement(dynamicArray) == -1) {
//                dynamicArray = increaseSize(dynamicArray);
//            }
//            dynamicArray[getFirstNotNullEllement(dynamicArray)] = el;
//        }
//​
//        public void remove(int index) {
//            try {
//                dynamicArray[index] = null;
//            } catch (IndexOutOfBoundsException e) {
//                e.printStackTrace();
//            }
//        }
//​
//        public T get(int index) {
//            return (T) dynamicArray[index];
//        }
//​
//        public void printDynamicArray(DynamicArray<T> array) {
//            for (int i = 0; i < array.getSizeArray(array); i++) {
//                System.out.println(i + ": " + array.get(i));
//            }
//        }
//    }
//}
//​
//        ​