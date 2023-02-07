public class testeThreads {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 1: " + i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 2: " + i);
            }
        }).start();

    }
}
