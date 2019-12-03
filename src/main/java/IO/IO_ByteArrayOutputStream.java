package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IO_ByteArrayOutputStream {
    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String text = "Hello World!!!";

        // Перекодируем строки алгоритмом UTF-8 в массив байт:
        byte[] buffer = text.getBytes(StandardCharsets.UTF_8);

        // Записываем в поле buf объекта baos содержимое byte[] buffer:
        baos.write(buffer[0]);

        byte[] result = baos.toByteArray();
        System.out.println(new String(result));

        System.out.println(Arrays.toString(result));

        try (FileOutputStream fos = new FileOutputStream("/Users/abc/Desktop/a/eee.txt")) {
            // Из поля buf объекта baos записываем массив байт в файл eee.txt:
            baos.writeTo(fos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
