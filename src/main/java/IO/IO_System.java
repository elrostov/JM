package IO;
import java.io.*;
import java.nio.*;
import java.util.Scanner;

public class IO_System {
    public static void main(String[] args) {

        String str = "1 2 3\na1 b2 c3\n-1e3 18 .111 11bbb";
        Scanner sc = new Scanner(str);
        PrintStream ps = new PrintStream(System.out);
        double sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Double.parseDouble(s);
            } catch (NumberFormatException ignored) {

            }
        }
        ps.printf("%.6f", sum);
    }
}
