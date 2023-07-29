import java.util.Arrays;

public class MyClass {
    static int [] a = new int[1000];
    static int [] b = new int[1000];
    static int [] c = new int[1000];
    public static void main(String[] args) {
        Thread myThread1 = new Thread(() -> {
            int j = 1;
            for (int i = 0; i < a.length; i++) {
                a[i] = j; j++;
            }
            System.out.println("Завершено: первый массив заполнен!");
        });
        Thread myThread2 = new Thread() {
            @Override
            public void run() {
                int j = 1001;
                for (int i = 0; i<b.length; i++) {
                    b[i]=j; j++;
                }
                System.out.println("Завершено: второй массив заполнен!");
            }
        };
        Thread myThread3 = new Thread(new myThread());

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}