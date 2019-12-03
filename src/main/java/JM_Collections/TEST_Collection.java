package JM_Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TEST_Collection {
    /**
     * Почему так происходит - потому что мы передаем именно List,
     * в то время как Collection - более общий тип
     * Что надо изменить - изменить тип переменной с List на Collection
     * */
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3);

        Gen gen = new Gen();
        gen.m(integerList);

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
