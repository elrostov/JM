package JM_Functional_Interface;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task_6_3_9 {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<String, Integer> ifFalse = String::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply("A"));
    }

    public static <T, U> Function<T,U> ternaryOperator(
            Predicate<Object> condition,
            Function<Object,java.lang.Integer> ifTrue,
            Function<String,java.lang.Integer> ifFalse) {
        return t -> (U) (condition.test(t) ? ifTrue.apply(t) : ifFalse.apply((String) t));
    }
}
