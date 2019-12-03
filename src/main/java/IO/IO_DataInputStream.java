package IO;

import java.io.*;

public class IO_DataInputStream {
    public static void main(String[] args) {

        // считывание из файла
        try(DataInputStream dos = new DataInputStream(new FileInputStream("/Users/abc/Desktop/a/Tom.bin")))
        {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
            // Name: Tom  Age: 34  Height: 1,680000  Married: false
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
