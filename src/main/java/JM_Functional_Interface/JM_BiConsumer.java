package JM_Functional_Interface;

import java.util.function.BiConsumer;

public class JM_BiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, String> biCons = JM_BiConsumer::myPrint;
        biCons.accept("yes", "no");
    }
    static void myPrint(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
    }
}
