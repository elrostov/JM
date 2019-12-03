package JM_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_6_2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) {
            list.add(new Integer(sc.nextInt()));
        }
        for(int i = 0; i < list.size(); i += 2) {
            list.remove(i);
        }
        Collections.reverse(list);
        System.out.print(list);
    }
}
