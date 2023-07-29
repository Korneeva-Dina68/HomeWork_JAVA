import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {7, 28, 3, 99, 104, 555, 82, 3, 100, 66, 754, 45, 7, 10, 76, 75, 16, 22, 19, 25};

        for (int j = 0; j < 19; j++) {
            for (int i = 0; i < 19; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int x = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}
