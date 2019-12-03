package JM_Collections;

import java.util.Map;
import java.util.TreeMap;

public class JM_TreeMap {
    public static void main(String[] args) {

        String s = "abacaba";

        /*Создаем ассоциативный массив*/
        Map<Character, Integer> counter = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            /*
                Проверяет есть ли среди ключей i-ый символ
                Если такой ключ есть
            */
            if (counter.containsKey(s.charAt(i))) {
                /*То получим старое значение функцией get*/
                int oldValue = counter.get(s.charAt(i));
                int newValue = oldValue + 1;
                /*И увеличим старое значение на 1*/
                counter.replace(s.charAt(i), newValue);
            } else {
                /*
                    Если среди ключей еще нет такого символа,
                    то добавим в counter запись символ(ключ) - 1 (значение)
                */
                counter.put(s.charAt(i), 1);
            }
        }

        /*Перебираем все записи в counter и выводим в виде: ключ: значение*/
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}