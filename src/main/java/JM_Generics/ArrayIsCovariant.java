package JM_Generics;

public class ArrayIsCovariant {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        ref[0] = 1; // в рантайме будет ошибка

        System.out.println(ref[0]);
        System.out.println(ref[0].getClass());
    }
}
