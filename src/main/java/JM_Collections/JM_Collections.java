package JM_Collections;

import java.util.*;

public class JM_Collections {
    /**
     * Почему так происходит - потому что мы передаем именно List, в то время как
     * Collection - более общий тип
     * Что надо изменить - изменить тип переменной с List на Collection
     * */
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3);

        Measurable a = String::length;
        System.out.println(a.length("abc"));

        Gen gen = new Gen();
        gen.m(integerList);

    }
    public static List<String> sort(List<String> list){
        Collections.sort(list, String::compareTo);
        return list;
    }

    private interface Measurable {
        public int length(String string);
    }
    static class Gen<T> {


        <T> void m(Collection<T> collection) {//1
            System.out.println("first");
            for (T s : collection) {
                System.out.println(s);
            }
        }

        <T> void m(List<String> list) {
            System.out.println("second");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }


}

