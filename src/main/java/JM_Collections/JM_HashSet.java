package JM_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class JM_HashSet {
    public static void main(String[] args) {
        HashSet<AAA> s = new HashSet<>();

        AAA a0 = new AAA(1);
        AAA a1 = new AAA(1);

        System.out.println(a0.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a1.equals(a0));
        s.add(a0);
        System.out.println(s.add(a1));
        System.out.println(s.size());



        Iterator<AAA> it = s.iterator();

        while  (it.hasNext()) {
            System.out.println(it.next().i);
        }

    }
}

class AAA implements Comparable<AAA>{
    int i;

    AAA(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(AAA o) {
        return this.i - o.i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AAA aIt = (AAA) o;
        return i == aIt.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
