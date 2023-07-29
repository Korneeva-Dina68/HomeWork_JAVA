import java.util.Random;

public class Main {
    public static String[] names = {"Ольга", "Петр", "Василий", "Екатерина", "Дмитрий", "Сергей", "Светлана"};
    public static void main (String[] args) throws InterruptedException {
        Winner win = new Winner();
        Thread th1 = new Thread(() -> {
            try {
                Winner.setWinner(names[new Random().nextInt(names.length)]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread th2 = new Thread(() -> {
            try {
                win.printWinner();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        th1.start();
        Thread.sleep(2000);
        th2.start();
        Thread.sleep(2000);
    }
}
