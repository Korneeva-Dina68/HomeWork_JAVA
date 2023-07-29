public class Romb extends Polygon implements Size{
    public double height=9;
    Romb(double a, double b, double c, double d) {
        super(a, b, c, d);
    }
    @Override
    public double GetPerimeter(){
        double Perimeter = 4*a;
        System.out.println("Периметр ромба: " + Perimeter);
        return Perimeter;
    }
    public double GetArea(){
        double Area=a*height;
        System.out.println("Площадь ромба: " + Area);
        return Area;
    }
    @Override
    public void BigSmall() {
        if (GetArea()>=25){
            System.out.println("Ромб большого размера");
        } else {
            System.out.println("Ромб маленького размера");
        }
    }
}
