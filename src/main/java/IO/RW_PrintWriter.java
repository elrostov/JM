package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class RW_PrintWriter {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        try(PrintWriter pw = new PrintWriter(
                new FileOutputStream("printwriter.txt", true), true))
        {
            pw.println("Hello World!");
        }

        toString("1", 9);
        toString(2, "8");
    }

    public static void toString(String a, int b) {
        System.out.println( a+b );
    }
    public static void toString(int b, String a) {
        System.out.println( b+a );
    }
}
