package JM_Generics;

import java.util.Optional;

public class Test_Optional {
    public static void main(String[] args) {

        String text = "bar"; // обычная ссылка
        Optional<String> baz = Optional.of("baz"); // потенциально
        // отсутствующся ссылка
        /*
        1. text и baz становятся разными типами, несовместимыми друг с другом
        программист и компилятор их точно не перепутают.
        2. Обертка в виде Optional позволяет писать код без if, например:
        */
        baz.ifPresent(System.out::println); // означает то же самое, что и:
        /*
        if (s!=null) {
            System.out.println(s);
        }
        где s это переменная обычного типа String
        */

        String value = baz.orElse("baz"); // означает то же самое, что и:
        /*
        s!=null ? s : "baz
        */
        System.out.println(baz);

        Optional<String> foo = Optional.empty(); // возвращает пустой Optional не
        // содержащий ссылку на объект. Здесь компилятор просто подгоняет возвращаемое
        // значение к нужному типу, в данном случае String.

        Optional<String> bar = Optional.of("bar"); // возвращает Optional,
        // содержащий указанный объект, при этом, аргумент не может быть null.
        // Компилятор видит, значение какго типа мы передаем в параметризованный
        // фабричный метод и отдает нам экземпляр Optional, параметризованный
        // этим типом.

        Optional<String> bazz = Optional.ofNullable("bazz"); // возвращает Optional,
        // содержащий указанный объект, если там не null. А если null, то
        // возвращается пустой Optional
        // Компилятор видит, значение какго типа мы передаем в параметризованный
        // фабричный метод и отдает нам экземпляр Optional, параметризованный
        // этим типом.

        Optional<CharSequence> optionalCharSequence =
                Optional.<CharSequence>ofNullable("baz");
        /*
        Если мы хотим получить из строчки в качестве возвращаемого значения из
        фабричного метода экземпляр Optional, параметризованный типом CharSequence,
        то на это нужно явно указать компилятору: .<CharSequence>ofNullable("baz");
        Иначе эта строчка бы не откомпилировалась, так как типы Optional<String>
        и Optional<CharSequence> не совместимы между собой.
         */
    }
}

