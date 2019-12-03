package Serialize;

import java.io.*;
import java.util.Arrays;

public class Serialize {
    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(baos)) {
            Animal a0 = new Animal("Sam", 10, 10, true);
            Animal a1 = new Animal("Tom", 20, 20, true);
            Animal a2 = new Animal("Bob", 30, 30, true);
            oos.writeInt(3);
            oos.writeObject(a0);
            oos.writeObject(a1);
            oos.writeObject(a2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(Arrays.toString(deserializeAnimalArray(baos.toByteArray())));



//        try (ObjectInputStream ois =
//                     new ObjectInputStream(new FileInputStream("animal.dat"))) {
//            Animal a = (Animal) ois.readObject();
//            System.out.printf("Name: %s\tAge: %d\n", a.getName(), a.getAge());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }


    public static Animal[] deserializeAnimalArray(byte[] data) {

        int amountOfObjects;
        Animal[] arrayOfAnimalObjects = null;

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            amountOfObjects = ois.readInt();
            arrayOfAnimalObjects = new Animal[amountOfObjects];
            for (int i = 0; i < amountOfObjects; i++) {
                arrayOfAnimalObjects[i] = (Animal) ois.readObject();
            }

        } catch (IllegalArgumentException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return arrayOfAnimalObjects;
    }

}

