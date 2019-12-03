package IO;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class IO_BufferedInputStream {
    public static void main(String[] args) throws IOException {

        String str = "jwehf;ewohew;ohwjwehf;ewohew;ohwjwehf;ewohew;ohwjwehf;ewohew;ohwjwehf;ewohew;ohwjwehf;ewohew;ohw";
        byte[] buffer = str.getBytes(StandardCharsets.UTF_8);

        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(bais);
        int count = 0;
        byte[] arr = new byte[bufferedInputStream.available()];
        int c;
        try {
            while ((c = bufferedInputStream.read(arr, 0, arr.length)) != -1) {
                System.out.println(++count);
                System.out.println();
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
