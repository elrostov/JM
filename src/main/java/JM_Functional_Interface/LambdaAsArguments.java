package JM_Functional_Interface;

public class LambdaAsArguments {
    public static void main(String[] args) {
        System.out.println(stringOp(x -> x.toUpperCase(), "abc def ghi"));
        System.out.println(stringOp2(x -> x.toUpperCase(), "abc def ghi"));

    }

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    static String stringOp2(StringFunc2 sf, String s) {
        return sf.func(s);
    }
}
interface StringFunc {
    String func(String n);
}

interface StringFunc2 {
    String func(String n);
}