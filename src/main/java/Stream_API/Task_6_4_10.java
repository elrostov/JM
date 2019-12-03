package Stream_API;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_6_4_10 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        List<Integer> list = new ArrayList<>();

//        System.out.println(Arrays.toString(pseudoRandomStream(13).toArray()));
    }

    public static IntStream pseudoRandomStream() {
        return IntStream.iterate(1, n -> (n + n)).limit(10);
    }
}
