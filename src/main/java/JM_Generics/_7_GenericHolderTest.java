package JM_Generics;

public class _7_GenericHolderTest<T> {
    public static void main(String[] args) {
        _6_GenericHolder<String> strHolder = new _6_GenericHolder<>();
        /*
        Создали специальный склад только для строк, и компилятор уже не
        примет всё, что угодно, а только строки, потому что теперь он
        всё проверяет и дает нам гарантии.
         */

        strHolder.setData("Hello!");

        //strHolder.setData(new int[]{10,20,30});
        /*
        Уже нельзя положить в холдер массив интов, так как  у
        _6_GenericHolder<String> объявлено, что он принимает только String.
         */

        String str = strHolder.getData();
        /*
        При изъятии данных из холдера уже не нужно приведение типов, потому
        что компилятор уже всё проверил, когда это сохранял.
         */
    }
}
