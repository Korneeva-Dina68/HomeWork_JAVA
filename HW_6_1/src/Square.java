public class Square extends GeomFigure{
    String color="черный";
    double Perimeter=a*a;
    double Area=4*a;
    Square(double a, double b) {
        super(3.0, 4.5);
    }
    @Override
    public double GetPerimeter(){
        System.out.println("Периметр квадрата: " + Perimeter);
        return Perimeter;
    }
    @Override
    public double GetArea(){
        System.out.println("Площадь квадрата: " + Area);
        return Area;
    }
    @Override
    public void NewColor(){
        System.out.println("Цвет квадрата " + color);
    }
}
