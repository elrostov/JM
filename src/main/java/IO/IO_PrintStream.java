package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IO_PrintStream {
    public static void main(String[] args) {

        String str = "Привет мир!\nAAAAAAA";

        try (PrintStream printStream = new PrintStream("/Users/abc/Desktop/a/printstream.bin", "UTF-8")) {
            printStream.println(str);
            System.out.println("Запись в файл произведена");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
