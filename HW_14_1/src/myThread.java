import java.util.Arrays;

class myThread extends Thread {
    public void run() {
        int j=2001;
        for (int i=0; i<MyClass.c.length; i++) {
            MyClass.c[i]=j; j++;
        }
        System.out.println("Завершено: третий массив заполнен!");
    }
}
