package Unicode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Unicode {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        String str0 = "Ы";
        byte[] arr0 = str0.getBytes();
        System.out.println(Arrays.toString(arr0));

    }
}
