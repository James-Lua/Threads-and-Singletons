public class SingletonThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new SingletonThread();
            thread.start();
        }
    }
}
