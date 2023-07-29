import java.util.stream.Stream;

public class A{
    public static void main (String[] args) {
        Stream<String> stream = Stream.of("Olga", "Ivan", "Sergey", "Aleksandr", "Aleksey", "Nina", "Olga", "Ivan", "Sergey", "Aleksandr", "Aleksey", "Nina");

        stream.filter(n -> n.length()<=6)
                .distinct()
                .map((n) -> {StringBuilder s = new StringBuilder(n);
                    s.setCharAt(0, 't');
                    return s.toString();})
                .forEach(System.out::println);
    }
}