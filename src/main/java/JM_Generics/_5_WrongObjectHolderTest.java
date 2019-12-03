package JM_Generics;

/**
 * Здесь описывается проблема использования общего хранилища для
 * всех типов объектов.
 */

public class _5_WrongObjectHolderTest {
    public static void main(String[] args) {
        _2_ObjectHolder holder = new _2_ObjectHolder();
        /*
        Создали новый универсальный "склад" (холдер), который
        хранит любые контейнеры типа Object, которые могут
        хранить массив интов, Стринг, Дабл и т.д.

        Этот холдер небезопасен с точки зрения типов, он все хранит
        и говорит: "Я всё привожу к общему типу и я забываю, что
        там лежит. А ты, программист, сам помни, какой именно тип
        данных ты туда положил."
        */


        holder.setData(new int[]{10,20,30});  // положили массив интов
        holder.setData("Hello"); // перезаписали массив интов строкой
        holder.setData(3.14); // перезаписали строку Даблом


        //int[] str = (int[]) holder.getData();
        /*
        Здесь компилятор даже не заикнулся об ошибке!!!
        Потому что его устраивает то, что мы из общего хранилища
        объектов достаем какой-то объект, ведь это допустимо. И
        по-хорошему мы сами должны помнить, какой имеено тип объекта
        мы туда положили: массив интов, Стринг, Дабл и т.д., и сами
        должны указать к какому типу привести.

        Здесь мы не угадали с типом. Вместо Дабла запросили
        объект и привели его к массиву интов, так как мы забыли, что именно
        мы туда положили.

        В рантайме нам выдаст исключение ClassCastException о
        том, что Дабл не может быть приведен к массиву интов.

        Из этого можно сделать вывод, что мы сами должны помнить,
        какой тип объекта мы кладем в холдер, а это очень накладно,
        ведь постоянно помнить типы во всех холдерах невозможно.

        И тут приходят на помощь Дженерики...
         */

        //System.out.println(str);
    }
}
