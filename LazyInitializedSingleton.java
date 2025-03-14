public class LazyInitializedSingleton {

    private static volatile LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitializedSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializedSingleton();
                }
            }
        }
        return instance;
    }
}
