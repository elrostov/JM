package JM_Functional_Interface;

import java.util.Arrays;

public class MethodRefWithObject {

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {
                new HighTemp(10), new HighTemp(20),
                new HighTemp(30), new HighTemp(40),
                new HighTemp(50), new HighTemp(60),
                new HighTemp(70), new HighTemp(89)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println();
        System.out.println(count);
    }
    //Метод, возвращающий количество экземпляров объекта,
    //найденных по критериям, задаваемым параметром
    //функционального интерфейса MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for(int i=0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
        }
        return count;
    }
}
interface MyFunc<T> {
    boolean func(T v1, T v2);
}
class HighTemp {
    int hTemp;

    public HighTemp() {
    }

    HighTemp(int ht) { hTemp = ht; }

    //возвратить логическое значение true, если
    //вызывающий объект типа HighTemp содержит
    //такую же температуру, как и у объекта ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    //возвратить логическое значение true, если
    //вызывающий объект типа HighTemp содержит
    //температуру ниже, чем у объекта ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class HighTempChild extends HighTemp{

    HighTempChild(int ht) { hTemp = ht; }
    boolean sameTemp(HighTemp ht2) {
        System.out.println("child");
        return hTemp - ht2.hTemp == 0;
    }
}

