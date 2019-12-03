package IO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO_DirectoryStream {
    public static void main(String[] args) throws IOException {

        Path path0 = Paths.get("./");
        Path path1 = Paths.get("./b.txt");
        Path path2 = Files.createFile(path1);

        try (DirectoryStream<Path> dirStream =
                     Files.newDirectoryStream(path0)){
            for (Path child : dirStream) {
                System.out.println(child);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
