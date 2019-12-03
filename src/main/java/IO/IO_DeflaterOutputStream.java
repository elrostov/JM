package IO;

import java.io.*;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;

public class IO_DeflaterOutputStream {
    public static void main(String[] args) throws FileNotFoundException {

        /*
         * Так как мы хотим сжать не просто тип byte, а значение типа int = 12345,
         * то нам нужно вызвать метод writeInt(), который есть у DataOutputStream,
         * поэтому мы создаем его экземпляр. Передаем ему в конструктор экземпляр
         * DeflaterOutputStream, который будет всё шифровать на лету и передавать
         * в переданный ему в конструктор FileOutputStream, то есть записывать в
         * файл на диске.
         */
        try (DataOutputStream os =
                     // Здесь int конвертируется в байты:
                     new DataOutputStream(
                             // Здесь байты сжимаются:
                             new DeflaterOutputStream(
                                     // Здесь сжатые байты записываются в файл:
                                     new FileOutputStream("/Users/abc/Desktop/a/deflate.bin"))))
        {
            os.writeInt(746356282);
        } catch (IOException ex) {
            ex.getMessage();
        }


    }
}
