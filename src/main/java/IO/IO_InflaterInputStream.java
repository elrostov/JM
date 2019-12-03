package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

public class IO_InflaterInputStream {
    public static void main(String[] args) {

        /*
        Нам нужно распаковать сжатый файл deflate.bin, который содержит в себе
        данные типа int. Прочитать int из byte можно методом readInt(), который
        есть только у DataInputStream, поэтому создаем его экземпляр. Так как мы
        должны этому методу передать уже распакованный int, то перед этим мы должны
        наши данные обработать InflaterInputStream
         */
        try (DataInputStream is =
                     new DataInputStream(
                             new InflaterInputStream(
                                     new FileInputStream("/Users/abc/Desktop/a/deflate.bin"))))
        {
            int b;
            while ((b = is.readInt()) != -1) {
                System.out.println(b);
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
