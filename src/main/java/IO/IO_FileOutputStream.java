package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO_FileOutputStream {
    public static void main(String[] args) {

        byte[] arr0 = {-48, 50, 98, -77};

        try (FileOutputStream fos = new FileOutputStream("/Users/abc/Desktop/a/fos.txt")) {
            // Записываем сырые байты в файл
            fos.write(arr0);
        } catch (IOException e) {

        }
    }
}
