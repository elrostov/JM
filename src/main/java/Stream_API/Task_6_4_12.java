package Stream_API;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_6_4_12 {
    public static void main(String[] args) {
        try (BufferedReader reader0 = new BufferedReader(
                new InputStreamReader(System.in, "UTF-8"))) {

        } catch (Exception e) {
            e.getMessage();
        }
        BufferedReader reader =
                new BufferedReader(
                        new StringReader("Mother washed-washed-washed rama! aaa bbb ccc " +
                                "ddd eee fff qqq aaa aaa qqq aaa"));

        Map<String, Long> hashMap = reader.lines()
                .flatMap(x -> Arrays.stream(x.toLowerCase().split("[\\p{Punct}\\s]+")))
                .collect(Collectors.groupingBy(String::new, Collectors.counting()));

        hashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEachOrdered(e -> System.out.println(e.getKey()));
//        System.out.println(hashMap);

    }
}
