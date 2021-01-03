public class ThreadName implements Runnable {
    public static void main(String[] args) {
        ThreadName runner = new ThreadName();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("поток альфа");
        beta.setName("поток бета");
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Сейчас работает " + threadName);
        }
    }
}
