package JM_Functional_Interface;

import java.util.function.IntPredicate;

public class DefaultMethodsInFunctionalInterfaces {
    public static void main(String[] args) {
        IntPredicate isOdd = x -> x % 2 != 0;
        IntPredicate isEven = isOdd.negate(); // Меняет логику на обратную
        System.out.println(isOdd.test(5));
        System.out.println(isEven.test(5));


        IntPredicate p1 = x -> x > 0;
        IntPredicate p2 = x -> x > 10;
        IntPredicate p3 = p1.and(p2); // Если и p1 и p2 вернут true, то p3 вернет true
        System.out.println(p3.test(11));



    }

}
