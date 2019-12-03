package JM_Generics;

/**
 * Создадим класс GenericHolder, который и полиморфный и типобезопасный.
 * Он позволляет в одном классе хранить и строки и инты, гарантируя, что
 * там будет именно то, что мы туда положили.
 *
 * Здесь мы говорим, что будет класс, хранящий <T>, а что такое <T> мы
 * пока не договариваем. Также определяем, что будет полее типа <T>, метод
 * getData(), возвращающий <T>, метод setData(<T>), устанавливающий <T>.
 *
 * @param <T>
 */

public class _6_GenericHolder<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
