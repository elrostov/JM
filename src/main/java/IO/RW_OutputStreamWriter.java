package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class RW_OutputStreamWriter {
    public static void main(String[] args) throws IOException {

        String str = "OutputStreamWriter конвертирует входящие символы и строки в " +
                "байты в соответствии с кодировкой, полученной в конструкторе, " +
                "и передает их в поток, полученный тоже в конструкторе. " +
                "Результирующие байты накапливаются во внутреннем буфере, после чего " +
                "выдаются потоку пачкой. " +
                "OutputStreamWriter лучше заворачивать в BufferedWriter";

        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream("/Users/abc/Desktop/a/out.txt"),
                StandardCharsets.UTF_16)) {
            writer.write(str);
        } catch (IOException e) {
            e.getMessage();
        }


    }
}
