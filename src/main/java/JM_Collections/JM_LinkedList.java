package JM_Collections;

import java.util.LinkedList;
import java.util.List;

public class JM_LinkedList {
    public static void main(String[] args) {

        List<A> list0 = new LinkedList<>();
        list0.add(new A());
        list0.add(new A());
        list0.add(new B());
        System.out.println(list0);
        System.out.println(-101%2);
    }
}

class A {

}
class B extends A {

}
