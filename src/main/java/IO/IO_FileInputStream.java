package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IO_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("questions.txt");
    }
}
