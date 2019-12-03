package IO;

import java.io.*;

public class ReadAsString {
    public static void main(String[] args) {

        byte[] arr = {48, 49, 50, 51};

        ByteArrayInputStream bais = new ByteArrayInputStream(arr);

        try (BufferedInputStream bis = new BufferedInputStream(bais);
        ) {

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
