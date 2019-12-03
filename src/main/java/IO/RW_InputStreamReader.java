package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class RW_InputStreamReader {
    public static void main(String[] args) throws IOException {

        String str = "InputStreamReader считывает байты из потока, переданного в " +
                "конструктор, и преобразует их в символы char, используя кодировку, " +
                "тоже переданную в конструктор." +
                "Метод read() читает один символ из потока." +
                "Метод read(char[] cbuf, int offset, int length) читает массив символов из потока." +
                "InputStreamReader лучше заворачивать в BufferedReader";

        // Reader reader = new StringReader(str);

        // Либо можно посложнее:
        Reader reader = new InputStreamReader(
                new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)),
                StandardCharsets.UTF_8);

        /*
        Из файла:
        Reader reader = new FileReader("/Users/abc/Desktop/a/in.txt");

        Или:
        Reader reader = new InputStreamReader(
                new FileInputStream("/Users/abc/Desktop/a/in.txt"), StandardCharsets.UTF_8);
         */

        int r;
        while ((r = reader.read()) != -1) {
            // Выводим каждый символ, состоящий из 2-х байт:
            System.out.print((char) r);
        }
    }
}
