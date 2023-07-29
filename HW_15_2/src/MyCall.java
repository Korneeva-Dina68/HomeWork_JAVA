import java.util.concurrent.Callable;

public class MyCall implements Callable {
    static Integer result;
    public static int addElement(Integer a, Integer b) {
        result=a;
        while (a<=b) {
            result += a++;
        }
        return result;
    }
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