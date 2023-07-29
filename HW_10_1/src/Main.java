import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 2, 8, 24, 12, 4, 56, 12, 45, 8, 7, 7, 1, 98, 8, 15, 36, 99, 81, 101, 20);
        Set<Integer> set = new HashSet<>(arr);
        System.out.println(set.size());
    }
}