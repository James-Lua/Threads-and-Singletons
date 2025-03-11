class SingletonThread extends Thread {
    @Override
    public void run() {
        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
        System.out.println("Thread " + Thread.currentThread().getId() + " - HashCode: " + instance.hashCode());
    }
}
