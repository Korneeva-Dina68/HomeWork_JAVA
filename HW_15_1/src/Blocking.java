import java.util.Random;
import java.util.concurrent.*;

public class Blocking {
    static ExecutorService service = Executors.newFixedThreadPool(4);
    static ArrayBlockingQueue <Future<Integer>> futures = new ArrayBlockingQueue<>(10);

    public static void main (String[] args) throws ExecutionException, InterruptedException {

        for (int i=0; i<10; i++) {
            final int x = MyCall.addElement((new Random().nextInt(10)), (new Random().nextInt(10,20)));
            futures.add(service.submit(()->x));
        }
        for (Future<Integer> future:futures){
            int ft = future.get();
        }
        service.shutdown();
        removeElement();
    }
    public static void removeElement() {
        futures.remove();
    }
}