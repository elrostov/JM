package JM_Generics;

import java.util.ArrayList;

class WildCardLowerBound {
    public static void main(String[] args) {
//        ArrayList<Object> ref = new ArrayList<Integer>(); // будет ошибка
        /*
        У дженериков ArrayList<Integer>() не приводится к ArrayList<Object>
        - будет ошибка. Т.е. список Интеджеров не является списком Объектов.
        Но можно записать так:
        */
        ArrayList<? extends Integer> ref = new ArrayList<Integer>();
        /*
        Это означает: “ArrayList не знаю чего, что является наследником
        Object”.
        = присвоение работает
        чтение работает
        запись НЕ работает
        */

        Object ref2 = ref.get(0);
        /*
        В этом случае взять из ArrayList можно и записать в переменную
        типа Object
        */

        Integer ref3 = (Integer) ref.get(0);
        /*
        В этом случае взять из ArrayList можно и записать в переменную
        типа Integer с приведением типов.
        */


//        ref.add(1);
//        ref.add(new Object());
        /*
        Но записать Интеджер не получится, так тип ArrayList точно не
        определен.
        */
    }
}
