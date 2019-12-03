package Stream_API;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Lesson_6_4_3 {
    public static void main(String[] args) {

        DoubleStream randomNumbers = DoubleStream.generate(Math::random);
        System.out.println(Arrays.toString(randomNumbers.limit(10).toArray()));

        IntStream integers = IntStream.iterate(0, n -> n + 1);

    }
}
