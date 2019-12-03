package IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;




public class RW_BufferedWriter {
    public static void main(String[] args) throws IOException {

//        String str = "Hello  World!\nHey! Teachers! Leave them kids alone.";
//
//        try (BufferedWriter bw = new BufferedWriter(
//                new FileWriter("/Users/abc/Desktop/a/newbr.txt"))) {
//            bw.write(str);
//        }
//

        // Новый метод newBufferedWriter() и newLine()
        try (BufferedWriter writer =
                     Files.newBufferedWriter(Paths.get("/Users/abc/Desktop/a/newbr.txt"),
                        StandardCharsets.UTF_8)) {
            writer.write("Hello!");
            writer.newLine();
        }

        // Новый метод write()

        List<String> lines = Arrays.asList("Hello", "World");
        Files.write(Paths.get("/Users/abc/Desktop/a/List.txt"), lines, StandardCharsets.UTF_8);

    }
}
