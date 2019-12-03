package JM_Functional_Interface;

import java.util.Arrays;
import java.util.function.IntFunction;

public class ConstructorRefArray {
    public static void main(String[] args) {
        IntFunction<String[]> arrayLocator = String[]::new;
        String[] stringArr = arrayLocator.apply(5);
        System.out.println(Arrays.toString(stringArr));
    }
}
