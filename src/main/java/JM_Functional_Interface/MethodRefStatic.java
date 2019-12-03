package JM_Functional_Interface;

public class MethodRefStatic {
    public static void main(String[] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(outStr);

        Measurable a = String::length;
        System.out.println(a.lengthMeasurable("abc"));

    }
    static String stringOp(StringFunction sf, String s) {
        return sf.func(s);
    }
}

interface StringFunction {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

interface Measurable {
    int lengthMeasurable(String str);
}