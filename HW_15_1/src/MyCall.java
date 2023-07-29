import java.util.concurrent.Callable;

public class MyCall implements Callable {
    public static int addElement(Integer a, Integer b) {
        result=a;
        while (a<=b) {
            result += a++;
        }
        return result;
    }
    static Integer result;
    @Override
    public Object call() {
        addElement(1, 2);
        return result;
    }
}
class MyRun implements Runnable {

    @Override
    public void run() {
        Blocking.removeElement();
    }
}