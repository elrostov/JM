package IO;

import java.io.*;

public class IO_BufferedOutputStream {
    public static void main(String[] args) {

        String str = "kahfgliwgfewfgyewagfoewf";

        try (BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("/Users/abc/Desktop/a/buf.txt"))) {
            byte[] buffer = str.getBytes();
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
