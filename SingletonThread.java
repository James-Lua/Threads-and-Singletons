class SingletonThread extends Thread {
    @Override
    public void run() {
        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
        System.out.println("Thread " + Thread.currentThread().getId() + " - HashCode: " + instance.hashCode());
    }
}

public class SingletonThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new SingletonThread();
            thread.start();
        }
    }
}
