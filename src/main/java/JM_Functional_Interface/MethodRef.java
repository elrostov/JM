package JM_Functional_Interface;

public class MethodRef {
    public static void main(String[] args) {

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        System.out.println(sum(nums, ExpressionHelper::isPositive));

        System.out.println(sum(nums, ExpressionHelper::isNegative));

        Expression expression = new Expression() {
            @Override
            public boolean isEqual(int n) {
                return n%2 == 0;
            }
        };
        System.out.println(expression.getClass());
    }

    private static int sum (int[] numbers, Expression func) {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

}
// функциональный интерфейс
interface Expression{
    boolean isEqual(int n);
}
// класс, в котором определены методы
class ExpressionHelper {
    static boolean isEven(int n) { return n%2 == 0; }
    static boolean isPositive(int n) { return n > 0; }
    static boolean isNegative(int n) { return n < 0; }
}