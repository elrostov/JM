package JM_Collections;

import java.util.*;

public class JM_TreeSet {
    public static void main(String[] args) {

        Set<Point2D> set = new TreeSet<>();
        set.add(new Point2D(0, 0));
        set.add(new Point2D(0, 10));
        System.out.println(set);
        System.out.println(set.contains(new Point2D(0, 0)));

    }
}

class Point2D implements Comparable<Point2D> {
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point2D that) {
        return this.x - that.y;
    }
}
