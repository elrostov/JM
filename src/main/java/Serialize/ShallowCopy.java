package Serialize;

public class ShallowCopy {
    public static void main(String[] args) {
        Persona hus0 = new Persona();
        hus0.name = "Mike";
        Persona wife = new Persona();
        wife.name = "Sara";
        hus0.couple = wife;
        wife.couple = hus0;

        Persona hus1 = new Persona(hus0);
        hus1.couple.name = "Anna";
        System.out.println(hus0.couple.name);


    }
}

class Persona {
    Persona(){}
    Persona(Persona source) {
        this.name = source.name;
        this.couple = source.couple;
    }
    String name;
    Persona couple;
}