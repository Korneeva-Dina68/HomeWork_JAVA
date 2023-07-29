public class Lesson3_1 {
    static int number=7;
    static String str;
    public static void main(String[] args) {
        lesson3_1();
        System.out.println(str);

        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else if (number == 10) {
            System.out.println("ten");
        }
    }
    public static void lesson3_1() {
        switch (number) {
            case 1 -> str = "one";
            case 2 -> str = "two";
            case 3 -> str = "three";
            case 4 -> str = "four";
            case 5 -> str = "five";
            case 6 -> str = "six";
            case 7 -> str = "seven";
            case 8 -> str = "eight";
            case 9 -> str = "nine";
            case 10 -> str = "ten";
        }
    }
}