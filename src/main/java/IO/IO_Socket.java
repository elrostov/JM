package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class IO_Socket {
    public static void main(String[] args) {

        try (Socket socket = new Socket("ya.ru", 80)) {

            OutputStream os = socket.getOutputStream();
            os.write("GET / HTTP/1.0\r\n\r\n".getBytes());
            os.flush();

            InputStream is = socket.getInputStream();
            int read = is.read();
            while (read >= 0) {
                System.out.println((char) read);
                read = is.read();
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
