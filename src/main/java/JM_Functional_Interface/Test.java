package JM_Functional_Interface;

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Up up = x -> z.p(x);
        up.p(3);

        Up up2 = new Up() {
            @Override
            public void u(int x) {
                System.out.println("up2: " + x);
            }
        };
        methodUp(up2);

    }
    static void methodUp(Up up) {
        up.u(5);
    }
}

interface Up {
    void u(int x);
    default void p(int x){
        System.out.println("p in Up");
    }
}

class Z implements Up {
    @Override
    public void u(int x) {
        System.out.println("u in Up");
    }
}