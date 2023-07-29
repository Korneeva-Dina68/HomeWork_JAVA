public class Triangle extends GeomFigure{
    public double c=1.8;
    public double h=4.8;
    String color="красный";
    Triangle(double a, double b, double c, double h) {
        super(4.0, 3.0);
        this.c=c;
        this.h=h;
    }
    @Override
    public double GetPerimeter(){
        double Perimeter = a + b + c;
        System.out.println("Периметр треугольника: " + Perimeter);
        return Perimeter;
    }
    @Override
    public double GetArea(){
        double Area=(a*h)/2;
        System.out.println("Площадь треугольника: " + Area);
        return Area;
    }
    @Override
    public void NewColor(){
        System.out.println("Цвет треугольника "+ color);
    }
}