import java.util.Random;
import java.util.concurrent.*;

public class Blocking {
    static ExecutorService service = Executors.newFixedThreadPool(4);
    static ArrayBlockingQueue <Future<Integer>> futures = new ArrayBlockingQueue<>(10);

    public static void main (String[] args) throws ExecutionException, InterruptedException {
        int sum;

        for (int i=0; i<10; i++) {
            final int x = MyCall.addElement((new Random().nextInt(10)), (new Random().nextInt(10,20)));
            futures.add(service.submit(()->x));
            System.out.println(x);
            final int y = Blocking.removeElement();

        }
        for (Future<Integer> future:futures){
            int ft = future.get();
        }
        service.shutdown();
        removeElement();
    }
    public static int removeElement() {
        futures.remove();
        return int;
    }
}