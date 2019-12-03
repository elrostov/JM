package Serialize;

import java.io.Serializable;

public class Animal implements Serializable {

        private String name;
        private int age;
        private double height;
        private boolean married;

    Animal(String n, int a, double h, boolean m){

            name=n;
            age=a;
            height=h;
            married=m;
        }
        String getName() {return name;}
        int getAge(){ return age;}
        double getHeight(){return height;}
        boolean getMarried(){return married;}

    @Override
    public String toString() {
        return "[Animal: Name = " + name +
                ", Age = " + age +
                ", Height = " + height +
                ", Married = " + married + "]";
    }
}
