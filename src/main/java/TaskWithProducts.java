import java.util.ArrayList;
import java.util.List;

public class TaskWithProducts {
    public static void main(String[] args) {
//        List<Product> productList0 = new ArrayList<>();
//        List<Product> productList1 = new ArrayList<>();
//        List<Camera> cameraList0 = new ArrayList<>();
//        List<Camera> cameraList1 = new ArrayList<>();
//        List<Phone> phoneList0 = new ArrayList<>();
//        List<Phone> phoneList1 = new ArrayList<>();
//
//        Container.copy(productList0, productList1);
//        Container.copy(cameraList0, productList0);

        Camera camera0 = new Camera("Canon", 200, 12000);

        Phone phone0 = new Phone("Apple", 100, "Iphone");
    }
}

abstract class Product implements Comparable<Product> {
    String name;
    Integer price;

    @Override
    public int compareTo(Product o) {
        return this.price - o.price;
    }

    public abstract void subCompare(Product p);
}


class Camera extends Product{
    Integer pixel;

    Camera(String name, Integer price, Integer pixel) {
        this.name = name;
        this.price = price;
        this.pixel = pixel;
    }
    @Override
    public void subCompare(Product p) {
        System.out.println();
    }
}

class Phone extends Product {
    String model;

    Phone(String name, Integer price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }
    @Override
    public void subCompare(Product p) {
    }
}

class Container<T extends Product> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void copy(List<? extends Product> src, List<? super Product> dst) {
        for (Product p : src) {
            dst.add(p);
        }
    }

    public  static void cameraCopy(List<Camera> src, List<Camera> dst) {
        dst.addAll(src);
    }
}
