import java.util.Arrays;

public class MyArray {

    static int[] arr={5, 1, 0, 6, 15, 3}, arr2;
    public static void array (int left, int right){
        arr2 = Arrays.copyOfRange(arr, left, right + 1);
        System.out.println(Arrays.toString(arr2));
        if (right<left){
            throw new MyException();
        }
        if (right>arr.length){
            throw new MyException();
            }
        if (left<0){
            throw new MyException();
        }
    }
    public static void main(String[] args) {
        try {
            array(1, 8);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            array(1, 4);
            System.out.println("No exceptions");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}