public class Main {
    public static void main(String[] args) {
        double a = 4;
        double b = -10;
        double c = 4;

        double D = b * b - 4 * a * c;

        //   System.out.println(D);

        if (D < 0) {
            System.out.println("No solutions");
        }

        if (D == 0) {
            double x = (-b / 2 * a);
            System.out.println("У уравнения один корень: " + x);
        }

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D))/2*a;
            double x2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("Корни уравнения:");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}