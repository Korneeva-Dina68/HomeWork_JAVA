public class Lesson_3_1_2 {
    public static void main(String[] args) {
        int c = 100;
        while (c <= 400) {
            if ((c % 3 != 0 || c % 7 != 0) || c % 9 == 0) {
                c++;
                continue;
            }
            System.out.println(c);
            c++;
        }
        for (int j = 100; j <= 400; j++) {
            if ((j % 3 == 0 && j % 7 == 0) && j % 9 != 0)
                System.out.print(j+ " ");
        }
    }
}