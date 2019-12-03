package IO;

import java.util.Scanner;

public class IO_Scanner_System_in {
    public static void main(String[] args) {

        // теперь будем вводить данные с клавиатуры!
        // источником данных для сканера может быть не только строка,
        // но и, например, консоль System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");


        // метод hasNextInt() проверяет, является ли следующая порция введенных
        // данных числом, или нет (возвращает, соответственно, true или false).
        if (sc.hasNextInt()) {
            // Метод nextInt() считывает и возвращает введенное число.
            int number = sc.nextInt();
            System.out.println("You have entered: " + number);
        } else {
            System.out.println("Извините, но это явно не число.");
        }
        sc.close();



    }
}
