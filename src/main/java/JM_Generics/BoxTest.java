package JM_Generics;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<? extends Integer> extIntList = integerList; // OK. List<Integer> is a subtype of List<? extends Integer>
        List<? extends Number>  numList = extIntList; // OK. List<? extends Integer> is a subtype of List<? extends Number>
        List<? extends Object> extObjList = numList; // OK. List<? extends Number> is a subtype of List<? extends Object>
        List<? super Integer> supInt = integerList;

        Integer i = new Integer(5);
        numberList.add(i);


        List<? extends Number> extNumList = numberList;
        List<? extends Object> extObjList1 = numberList;

        List<? super Number> superNumber = numberList;
        List<? super Integer> superIntegerList = numberList;

        List<Box1> b1 = new ArrayList<>();
        List<Box2> b2 = new ArrayList<>();


    }

}

class Box1<T> {

}

class Box2<T> extends Box1<T> {

}