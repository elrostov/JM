package Stream_API;

import java.util.*;
import java.util.function.Consumer;

public class Task_6_4_13_With_Common_Class_Without_Interface {
    public static void main(String[] args) {
        // Random variables
        String randomFrom = "USSR"; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "Stalin";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 100_000;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

        // Создание списка из трех почтовых сообщений.
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(firstMessage, secondMessage, thirdMessage);
        messages.forEach(x -> System.out.println(x.getContent()));

        // Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

        // Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);
        System.out.println(mailService.mailBox);

        // Получение и проверка словаря "почтового ящика",
        // где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ): "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ): "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";


        // Создание списка из трех зарплат.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

        // Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

        // Обработка списка зарплат почтовым сервисом
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);
        System.out.println(salaryService.mailBox);

        // Получение и проверка словаря "почтового ящика",
        //   где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";
    }

    public static class SendableClass<T> {
        String from;
        String to;
        T message;

        public SendableClass(String from, String to, T message) {
            this.from = from;
            this.to = to;
            this.message = message;
        }

        public String getFrom() {
            return from;
        }
        public String getTo() {
            return to;
        }
        public T getContent() {
            return message;
        }
    }

    public static class MailMessage extends SendableClass<String> {
        MailMessage(String from, String to, String message) {
            super(from, to, message);
        }
    }

    public static class Salary extends SendableClass<Integer> {
        Salary(String from, String to, Integer amount) {
            super(from, to, amount);
        }
    }

    public static class MailService<T> implements Consumer<SendableClass<T>> {

        Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return getOrDefault(key, Collections.emptyList());
            }
        };

        Map<String, List<T>>getMailBox() { return mailBox; }

        @Override
        public void accept(SendableClass<T> t) {
            List<T> list = new ArrayList<>();
            list.add(t.getContent());
            mailBox.merge(t.getTo(), list, (l1, l2) -> { l1.addAll(l2); return l1;});
        }
    }
}

