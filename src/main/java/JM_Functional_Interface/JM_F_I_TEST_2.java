package JM_Functional_Interface;

public class JM_F_I_TEST_2 {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {

        int n = 70;
        int m=30;
        Operation op = ()->{

            //n=100; //- так нельзя сделать
            return m+n; // Если перемнная (n) метода используется
            // в лямбда-выражении, то она автоматически становится
            // final
        };
        //n=100; // - так тоже нельзя
        System.out.println(n); // 100



//        Operation op = () -> {
//            x=30;
//            return x+y;
//        };
//        System.out.println(op.calculate()); // 50
//        System.out.println(x); // 30 - значение x изменилось
//        System.out.println(op.getClass());
//        System.out.println();

//        Operationable operation0 = (x,y) -> x + y;
//        System.out.println(operation0.calculate(20,10));
//        System.out.println(operation0.getClass());
//        System.out.println();
//
//        Operationable operation1 = (x,y) -> x - y;
//        System.out.println(operation1.calculate(20,10));
//        System.out.println(operation1.getClass());
//        System.out.println();
//
//        Operationable operation2 = (x,y) -> x * y;
//        System.out.println(operation2.calculate(20,10));
//        System.out.println(operation2.getClass());
//        System.out.println();
    }
}

interface Operationable {
    int calculate(int x, int y);
    default void print(int x, int y) {
        System.out.println(x + y);
    }
}

interface Operation{
    int calculate();
}