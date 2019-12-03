import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class JM_Comparable {
    public static void main(String[] args) {
        Car car0 = new Car(13, 2, 200);
        Car car1 = new Car(8, 3, 300);
        Car car2 = new Car(17, 1, 100);

        CarSpeedComparator csc = new CarSpeedComparator();

        Set<Car> set = new TreeSet<>(csc);

        set.add(car0);
        set.add(car1);
        set.add(car2);
    }
}

class Car implements Comparable<Car>{
    int year;
    int engineVolume;
    int speed;

    public Car(int year, int engineVolume, int speed) {
        this.year = year;
        this.engineVolume = engineVolume;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}

class CarEngineVolumeComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return 0;
    }
}

class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.speed - o2.speed;
    }
}