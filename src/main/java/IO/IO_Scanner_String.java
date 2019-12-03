package IO;

import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class IO_Scanner_String {
    public static void main(String[] args) {
//
//        Reader reader = new StringReader("abc|true|1,1e3|-42");
//
//        Scanner scanner0 =
//                new Scanner(reader).useDelimiter("\\|").useLocale(Locale.forLanguageTag("ru"));
//
//        String token = scanner0.next();
//        System.out.println(token);
//
//        boolean bool = scanner0.nextBoolean();
//        System.out.println(bool);
//
//
//        // Мы создали объект сканера и указали для него источник данных (строку с текстом).
//        Scanner scanner1 = new Scanner("Люблю тебя, Петра творенье,\n" +
//                "Люблю твой строгий, стройный вид,\n" +
//                "Невы державное теченье,\n" +
//                "Береговой ее гранит");
//        /*
//        Метод nextLine() обращается к источнику данных (нашему тексту с четверостишием),
//        находит там следующую строку, которую он еще не считывал (в нашем случае — первую)
//        и возвращает ее.
//        */
//        String s = scanner1.nextLine();
//        System.out.println(s); // Люблю тебя, Петра творенье,
//
//        // Мы можем использовать метод nextLine() несколько раз и вывести весь кусок поэмы:
//        s = scanner1.nextLine();
//        System.out.println(s); // Люблю твой строгий, стройный вид,
//
//        s = scanner1.nextLine();
//        System.out.println(s); // Невы державное теченье,
//
//        s = scanner1.nextLine();
//        System.out.println(s); // Береговой ее гранит


//        Scanner scan = new Scanner("На голой ветке\n" +
//                "Ворон сидит одиноко.\n" +
//                "Осенний вечер.\n\n***" +
//                " \n" +
//                " \n" +
//                "В небе такая луна,\n" +
//                "Словно дерево спилено под корень:\n" +
//                "Белеет свежий срез.\n\n***" +
//                " \n" +
//                " \n" +
//                "Как разлилась река!\n" +
//                "Цапля бредет на коротких ножках,\n" +
//                "По колено в воде.");

        // В метод useDelimiter() передается шаблон разделителя, по которому
        // входной поток будет нарезаться на токены. По умолчанию это пробельные
        // символы, но можно задать что-то своё
//        scan.useDelimiter("\n/*/*/*");
//
//        while (scan.hasNext()) {
//            System.out.println(scan.next());
//        }
//
//        scan.close();


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee id:");
        int empId = scan.nextInt();
        System.out.print("Enter employee name:");
        String empName = scan.next();
        scan.close();
    }
}
