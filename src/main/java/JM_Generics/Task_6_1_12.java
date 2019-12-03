package JM_Generics;


import java.util.Objects;

public class Task_6_1_12 {
    public static void main(String[] args) {
        Pair pair0 = Pair.of(0, "string0");
        Pair pair1 = Pair.of(1, "string1");


    }

}

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair<T, K>  of(T first, K second) {
        return new Pair<>(first, second);
    }





}
