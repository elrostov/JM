package JM_Generics;

import java.util.Arrays;
import java.util.List;

/**
 * Тест для старого способа хранения строк в холдере
 */

public class _3_HolderStringTest {
    public static void main(String[] args) {
        _0_StringHolder holder = new _0_StringHolder();
        _0_StringHolder holder1 = new _0_StringHolder();
        System.out.println(holder.getClass().equals(holder1.getClass()));


        List<Integer> ints = Arrays.asList(1,2,3);

    }
}
