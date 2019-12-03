package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class IO_ByteArrayInputStream {
    public static void main(String[] args) throws IOException {

        byte[] byteArray = new byte[] {1,2,3,4,5,6,7,8};

        // Записываем в буфер bais массив byteArray с bytearray[0] длиной 8:
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray, 0, 8);

        // Создаём массив, в который будем писать данные из буфера bais:
        byte[] resultArray = new byte[4];

        int b;

        // Пишем в resultArray начиная с resultArray[0] по 4 байта из буфера ByteArrayInputStream
        while ((b = bais.read(resultArray, 0, 4)) != -1) {
            System.out.println(Arrays.toString(resultArray)); // [1, 2, 3, 4] \n [5, 6, 7, 8]
        }
    }
}
