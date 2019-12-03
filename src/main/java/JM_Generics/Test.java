package JM_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        f(new A());
//        f(new B());

        List<String> strings = new ArrayList<>();
        strings.add("Старая строка 1");
        strings.add("Старая строка 2");
        strings.add("Старая строка 3");

        System.out.println(strings);

        fill(strings, "Новая строка");

        System.out.println(strings);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        List<? extends Number> num = new ArrayList<Integer>();
        fill(numbers, 888);
        System.out.println(numbers);

    }

    /*
    Этот метод полиморфен, так как он может быть применен и для вызова
    метода getName() у класса А и для метода getName() у класса В. Но
    для этого нужно выполнение двух условий:
    1. В должен быть наследником А
    2. метод f(А) должен быть объявлен для А

    Если В не будет наследоваться от А, то этот метод не будет работать для В.
    Нужно будет писать отдельный метод f() для В, например, используя
    перегрузку (overloading) метода, но это уже будет совсем другой метод.

    Это происходит потому, что в JAVA нет структурных типов - нельзя объявить
    метод f() и скзать ему, что он получит непонятно кого, у кого
    есть метод getName() и эти кто-то не наследуются один от другого.

    Можно выкрутиться только унаследовав В от А. В этом случае всё заработает,
    потому что в JAVA есть очень четкое правило: Потомок наследует все методы
    родителя, и потомок ничего не может их выбросить.
     */
    static void f(A arg) {
        System.out.println(arg.getName());
    }

    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}

class A {
    int a;

    public A(int a) {
        this.a = a;
    }

    String getName() {
        return "A";
    }
}

//class B extends A {
//    int b;
//    public B(int b) {
//        this.b = b;
//    }
//    String getName() {
//        return "B";
//    }
//}