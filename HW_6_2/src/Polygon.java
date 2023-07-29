import java.util.Arrays;

public class Polygon extends GeomFigure implements WithAngles {
    double c, d;
    int kolvoVershin = 5;
    int x,y;
    public Polygon[] polygons = new Polygon[kolvoVershin];

    Polygon(double a, double b, double c, double d) {
        super(a, b);
        this.c=c;
        this.d=d;
    }
    Polygon(int x, int y){
        super(x,y);
        this.x=x;
        this.y=y;
    }

    @Override
    public double GetPerimeter() {
        double Perimeter = a+b+c+d;
        System.out.println("Периметр многоугольника: " + Perimeter);
        return Perimeter;
    }

    @Override
    public double GetArea() {
        double Area = a*b*kolvoVershin; // это ложная формула
        System.out.println("Площадь многоугольника: " + Area);
        return Area;
    }

    @Override
    public void vertexes() {
        polygons[0]=new Polygon(1, 3);
        polygons[1]=new Polygon(-4, 2);
        polygons[2]=new Polygon(6, 1);
        polygons[3]=new Polygon(9, 4);
        polygons[4]=new Polygon(1, -3);
        System.out.println("Вершины многоугольника: ");
        for (Polygon polygon:polygons) {
            System.out.print(Arrays.toString(new String[]{polygon.x + ";" + polygon.y}));
        }
        System.out.println();
    }
}
