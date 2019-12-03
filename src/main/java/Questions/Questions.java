package Questions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {
    public static void main(String[] args) {

        List<Pet> src = new ArrayList<Pet>();
        src.add(new Kitty());
        src.add(new Kitty());
        src.add(new Doge());
        src.add(new Doge());
        List<Pet> dest = new ArrayList<Pet>();
        Collections.copy(dest, src);
        for(Pet p: dest) p.call();

        List<? super Pet> petList = new ArrayList<Pet>();
        petList.add(new Kitty());
        petList.add(new Kitty());
        petList.add(new Doge());
        petList.add(new Doge());

    }


}
class Animal { void feed() {} }
class Pet extends Animal { void call() {} }
class Kitty extends Pet{ void mew() {} }
class Doge extends Pet{ void bark() {} }
