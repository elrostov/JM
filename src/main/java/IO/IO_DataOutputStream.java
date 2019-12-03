package IO;

import java.io.*;

public class IO_DataOutputStream {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        // запись в файл
        try(DataOutputStream dos =
                    new DataOutputStream(new FileOutputStream("/Users/abc/Desktop/a/Tom.bin")))
        {
            // записываем значения
//            dos.writeUTF(tom.name);
//            dos.writeInt(tom.age);
//            dos.writeDouble(tom.height);
//            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
