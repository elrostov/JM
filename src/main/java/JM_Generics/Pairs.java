package JM_Generics;

class Pairs<A,B> {
    private final A first;
    private final B second;

    Pairs(A first, B second) {
        this.first = first;
        this.second = second;
    }
}

class pairTest {
    public static void main(String[] args) {
        Pairs<Integer, String> pairsIS = new Pairs<>(1, "Hello!");
        Pairs<String, Pairs<Integer, String>> pairsHard =
                new Pairs<>("Hello!", new Pairs<>(2, "World!"));

        System.out.println();
    }
}