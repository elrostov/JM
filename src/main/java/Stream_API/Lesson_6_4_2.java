package Stream_API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Lesson_6_4_2 {
    public static void main(String[] args) {

        IntStream.iterate(1, n -> n + 1)
                .filter(n -> n % 5 == 0 && n % 2 != 0)
                .limit(10)
//                .map(n -> n * n)
                .forEach(System.out::println);


    }
}
