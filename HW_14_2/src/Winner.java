import java.util.concurrent.Semaphore;

public class Winner {
    private static String name = "";
    private static Semaphore mutex = new Semaphore(1);
    public static void setWinner(String name) throws InterruptedException {
        mutex.acquire();
        Winner.name = name;
        System.out.println(name);
        mutex.release();
        }
    public static void printWinner() throws InterruptedException {
        mutex.acquire();
        System.out.println("Current winner is: " + name + ".");
        mutex.release();
    }
}
class MyThreadWriter implements Runnable {
    @Override
    public void run() {
        try {
            Winner.setWinner("вася");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThreadReader implements Runnable {
    @Override
    public void run() {
        try {
            Winner.printWinner();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}