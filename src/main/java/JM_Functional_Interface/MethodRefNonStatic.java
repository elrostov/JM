package JM_Functional_Interface;

public class MethodRefNonStatic {
    public static void main(String[] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";

//        String outStr = stringOp(n -> MyStringOpsNonStatic.strReverse(n), inStr);
//        System.out.println(outStr);

    }
    static String stringOp(StringFunctionNonStatic sf, String s) {
        return sf.func(s);
    }
}

interface StringFunctionNonStatic {
    default String func(String n) {
        return MyStringOpsNonStatic.strReverse(n);
    }
}

class Impl implements StringFunctionNonStatic {

    @Override
    public String func(String n) {
        return n + n;
    }
}

class MyStringOpsNonStatic {
    static String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}


