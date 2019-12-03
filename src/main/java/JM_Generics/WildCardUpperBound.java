package JM_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardUpperBound {
    public static void main(String[] args) {
        List<? super Number> ref = new ArrayList<Number>();
        /*
        Это означает: “ArrayList не знаю чего, что является Integer
        или его родителем .
        = присвоение работает
        чтение НЕ работает
        запись работает
        */

        ref.add(5);
        ref.add(7.0);
//        ref.add(new Object());
//
//        Integer i = ref.get(0);
        System.out.println(ref.get(0));
        System.out.println(ref.get(1).getClass());
    }
}
