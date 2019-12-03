package JM_Generics;

import java.util.ArrayList;

public class Copier {

    public static void copyObj(Object[] src, Object[] dst){
        int length = Math.min(src.length, dst.length);
        for (int k = 0; k < length; k++) {
            dst[k] = src[k];
        }
    }

    public static <T> void
    copyGen(ArrayList<? extends T> src, ArrayList<? super T> dst) {
        int length = Math.min(src.size(), dst.size());
        for (int k = 0; k < length; k++) {
            dst.set(k, src.get(k));
        }
    }

}
