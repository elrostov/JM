package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputOutputStream {

    public static void main(String[] args) throws IOException {
        /*
         * Копируем по 1024 байта из файла in.txt в файл out.txt
         * Используем try с ресурсами для того, чтобы метод close()
         * у наших открытых потоков гарантированно был вызван. При этом,
         * не нужно дополнительно вызывать метод flush(), т.к. закрытие
         * включает в себя также сброс буферов.
         */

        int totalBytesWritten = 0; // сколько всего байт рочитано из файла in.txt
        byte[] buf = new byte[1024]; // промежуточный буфер между потоками
        int blockSize = 0; // сколько байт считано из потока за одну итерацию
        int iterations = 0; // сколько всего итераций по 1024 байта (1 КБ)

        try (
//                InputStream is = new FileInputStream("/Users/abc/Desktop/a/in.txt");
//                Либо в конструктор можно передать объект File:
//                InputStream is = new FileInputStream(new File("/Users/abc/Desktop/a/in.txt"));
//                Либо экземпляр новенького Paths:
                InputStream is = Files.newInputStream(Paths.get("/Users/abc/Desktop/a/in.txt"));

//                OutputStream os = new FileOutputStream("/Users/abc/Desktop/a/out.txt")
//                Либо в конструктор можно передать объект File:
//                OutputStream os = new FileOutputStream(new File("/Users/abc/Desktop/a/out.txt"));
//                Либо экземпляр новенького Paths:
                OutputStream os = Files.newOutputStream(Paths.get("/Users/abc/Desktop/a/out.txt"))
            ) {
            while ((blockSize = is.read(buf)) != -1) {
                os.write(buf);
                totalBytesWritten += blockSize;
                iterations++;
            }
        } catch (IOException e ) {
            e.getMessage();
        }

        System.out.println("Total Bytes written: " + totalBytesWritten);
        System.out.println("Iterations: " + iterations);

    }
}
