import java.util.*;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
public class MyStream {
    public static <T> Stream <T> iter (Iterator<T> iterator) {
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.NONNULL);
        return StreamSupport.stream(spliterator, false);
    }
    public static void main (String[] args) {
        Integer[] arr = new Integer[30];
        fillRandom(arr, 2001);
        ArrayList <Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, arr);
        Iterator<Integer> iterator = arr2.iterator();
        Stream<Integer> iterStream = iter(iterator);
        iterStream.filter(n->n<1000)
                .filter(n->n>99)
                .filter(n->n%2==0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void fillRandom(Integer[] arr, int n) {
        Random r = new Random();
        for (int i = 0; i<arr.length; i++) {
            arr[i] = r.nextInt(n);
        }
    }
}
