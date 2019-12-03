package JM_Collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
//        measureListAddInTheBeginning(arrayList);
        // java.util.ArrayList. Add 300000 times in the beginning. Time: 10_523_054_777
//        measureListAddInTheMiddle(arrayList);
        // java.util.ArrayList. Add 300000 times in the middle. Time: 5_292_884_235
//        measureListAddInTheEnd(arrayList);
        // java.util.ArrayList. Add 1000 times in the end. Time: 926_874
        // java.util.ArrayList. Add 300000 times in the end. Time: 23_819_308
        // java.util.ArrayList. Add 1000000 times in the end. Time: 39_584_645

        List<String> linkedList = new LinkedList<>();
//        measureListAddInTheBeginning(linkedList);
        // java.util.LinkedList. Add 300000 times in the beginning. Time: 25_755_888
//        measureListAddInTheMiddle(linkedList);
        // java.util.LinkedList. Add 300000 times in the middle. Time: 88_531_624_261
//        measureListAddInTheEnd(linkedList);
        // java.util.LinkedList. Add 1000 times in the end. Time: 791_054
        // java.util.LinkedList. Add 300000 times in the end. Time: 20_232_459
        // java.util.LinkedList. Add 1000000 times in the end. Time: 94_106_782
    }

    public static void measureListAddInTheBeginning(List<String> list) {
        int iterations = 300_000;
        System.out.print(list.getClass().getName() +
                ". Add " + iterations + " times in the beginning. Time: ");
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(0, "a");
        }
        en = System.nanoTime();
        System.out.println(en - st);
    }

    public static void measureListAddInTheMiddle(List<String> list) {
        int iterations = 300_000;
        System.out.print(list.getClass().getName() +
                ". Add " + iterations + " times in the middle. Time: ");
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(list.size() / 2, "a");
        }
        en = System.nanoTime();
        System.out.println(en - st);
    }

    public static void measureListAddInTheEnd(List<String> list) {
        int iterations = 1_000;
        System.out.print(list.getClass().getName() +
                ". Add " + iterations + " times in the end. Time: ");
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add("a");
        }
        en = System.nanoTime();
        System.out.println(en - st);
    }


}
