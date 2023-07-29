public class Square extends GeomFigure{
    String color="черный";
    Square(double a, double b) {
        super(3.0, 4.5);
    }
    @Override
    public double GetPerimeter(){
        double Perimeter=4*a;
        System.out.println("Периметр квадрата: " + Perimeter);
        return Perimeter;
    }
    @Override
    public double GetArea(){
        double Area=a*a;
        System.out.println("Площадь квадрата: " + Area);
        return Area;
    }
    @Override
    public void NewColor(){
        System.out.println("Цвет квадрата " + color);
    }
}
