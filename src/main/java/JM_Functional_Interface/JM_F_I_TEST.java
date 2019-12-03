package JM_Functional_Interface;

import java.util.function.*;

public class JM_F_I_TEST {
    public static void main(String[] args) {

        IntUnaryOperator square = x -> { // Объявляем имя параметра - х
            return x * x; // Объявляем тело метода - непосредственно код
        };
        System.out.println(square.applyAsInt(4));


        IntConsumer print = System.out::println;
        print.accept(3);

        IntUnaryOperator cube = x -> x * x * x;
        System.out.println(cube.applyAsInt(3));


        DemoFI demoFI = new DemoFI();

        ToIntFunction<String> intParser = BABA::bar;
        System.out.println(intParser.applyAsInt("123"));


        Consumer<Object> printer = System.out::println;
        printer.accept(demoFI);
    }
}

class BABA {
    static <T> int bar(T t) {
        return Integer.parseInt((String) t);
    }
}

class DemoFI {
    private int counter;

    @Override
    public String toString() {
        return "I am DemoFI Class!";
    }

    public void foo() {
        IntUnaryOperator square = (x) -> x * x;

        IntSupplier sequence = () -> counter++;

        int bonus = 10;
        IntUnaryOperator bonusAdder = (x) -> x + bonus;


    }
}