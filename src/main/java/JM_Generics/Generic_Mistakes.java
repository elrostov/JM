package JM_Generics;

public class Generic_Mistakes {
    static class GTest1<T>{
        T test1Param;
        public GTest1(T test1Param) {
            this.test1Param = test1Param;
            System.out.println("Работает");
        }
        public static void method(){
            System.out.println("Метод работает");
        }
        public T get() {
            return test1Param;
        }
    }
    static class GTest2<T>{
        T test2Param;
        GTest1<T> gTest1 = new GTest1<>(test2Param);
//        gTest1.method();
        public GTest2(T test2Param) {
            this.test2Param = test2Param;
        }
        public GTest2(){
        }
    }
    public static void main(String[] args) {
        GTest2<String> gTest2 = new GTest2<>();
        System.out.println(gTest2.gTest1.get());
    }
}
