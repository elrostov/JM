package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RW_BufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
//
//        // Считываем посимвольно:
//        try (BufferedReader br = new BufferedReader(
//                new FileReader("/Users/abc/Desktop/a/bw.txt"))) {
//
//            int c;
//            while ((c = br.read()) != -1) {
//                System.out.println((char) c);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        // Считываем построчно:
//        try (BufferedReader br = new BufferedReader(
//                new FileReader("/Users/abc/Desktop/a/bw.txt"))) {
//
//            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        // Считывание с консоли в файл:
//        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(
//                    new FileWriter("/Users/abc/Desktop/a/console.txt")))
//        {
//            // чтение построчно
//            String text;
//            while(!(text=br.readLine()).equals("ESC")) {
//                bw.write(text + "\n");
//                bw.flush();
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

        //Старый способ считывания:
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("/Users/abc/Desktop/a/newbr.txt"),
//                        StandardCharsets.UTF_8))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.getMessage();
//        }

        // Новый способ считывания:
        Map<String, Long> map = new HashMap<>();
        Scanner sc = new Scanner(new FileReader("test.txt"));
        String key;
        Long value;
        while (sc.hasNext()) {
            key = sc.next();
            value = sc.nextLong();
            if(map.containsKey(key)) {
                Long newValue = map.get(key) + value;
                map.put(key, newValue);
            } else {
                map.put(key, value);
            }
        }
        System.out.println(map);
    }
}
