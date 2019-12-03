package JM_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class JM_LinkedHashMap {
    public static void main(String[] args) {

        Map<Integer, String> m =
                new LinkedHashMap<>(5, 1, true);
        /*
        Это интересный конструктор, который первым параметром принимает размер мапы,
        вторым параметром - коэффициент загрузки (1 значит размер будет меняться при
        заполнении ВСЕХ ячеек хеш-таблицы), третьим параметром - порядок по доступу:
        false - элементы буду возвращаться итератором в порядке по умолчанию - в
        LinkedHashMap это по очереди добавления;
        true - элементы буду возвращаться итератором начиная с самых непопулярных,
        то есть к которым реже применялся метод get(). Последним в будет возвращен
        элемент, к которому обращались последним, предпоследним будет элемент, к
        которому обращались предпоследним и т.д.

        accessOrder присутствует только в Map, в HashSet его нет, так как там сразу
        идет обращение к элементу
         */

        m.put(5, "a");
        m.put(4, "b");
        m.put(3, "c");
        m.put(2, "d");
        m.put(1, "e");

        m.get(3);

        m.get(5);
        m.get(1);
        m.get(3);

        System.out.println(m);
    }
}
