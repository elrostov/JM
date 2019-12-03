package Stream_API;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lesson_6_4_4 {
    public static void main(String[] args) {

        IntStream rawStream = IntStream.of(0, 50, 100, 150, 200);
        IntStream resultStream = rawStream.filter(n -> n > 100)
                .mapToObj(Integer::toString) // вернула ("150","200")
                .flatMapToInt(s -> s.chars()) // вернула стрим 49, 53, 48, 50, 48, 48
                .peek(x -> System.out.println(x))
                .distinct()
                .sorted()
                .skip(3)
//                .peek(System.out::println)
                .limit(2);

        System.out.println(Arrays.toString(resultStream.toArray()));


//        List<String> list = Arrays.asList("Geeks", "GFG",
//                "GeeksforGeeks", "gfg");

        // Using Stream flatMapToInt(Function mapper)
        // to get length of all strings present in list
//        list.stream().flatMapToInt(str -> IntStream.of(str.length())).
//                forEach(System.out::println);
//
//        System.out.println(factorial(10));
    }

    public static BigInteger factorial(int n) { // Напишем факториал
        return IntStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}