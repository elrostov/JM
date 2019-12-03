package JM_Generics;

import java.util.ArrayList;
import java.util.List;

public class MyTest<T extends Math> {
    public static void main(String[] args) {
        List<A> a = new ArrayList<>();
        a.add(new A());
        List<B> b = new ArrayList<>();
        List<C> c = new ArrayList<>();

        MyTest<Math> myTest = new MyTest<>();
        System.out.println();

        f0(a);
        f0(b);
        f0(c);

        f1(a);
        f1(b);

    }

    T method(T type) {
        return type;
    }

    public static void f0(List<? extends A> list) {
        list.get(0);
    }

    public static void f1(List<? super B> list) {
        list.add(new C());
        list.add(new B());
    }

static class A {

}
static class B<T> extends A {

}
static class C<T> extends B<T> {

}
static class D<T> implements GenInterface {
    private T t;
    @Override
    public T getT() {
        return t;
    }
}
interface GenInterface<T> {
        T getT();
    }
}
