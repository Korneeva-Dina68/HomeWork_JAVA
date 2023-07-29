public abstract class GeomFigure {
    double a, b;
    private double Perimeter;
    private double Area;
    public GeomFigure(double a, double b){
        this.a=a;
        this.b=b;
    }
    public abstract double GetPerimeter();
    public abstract double GetArea();
    public void NewColor(){
        System.out.println("Цвет фигур");
    }
    public static void main (String[] args){
        Square obj = new Square(3.0, 4.5);
        Triangle obj2 = new Triangle(4.0, 3.0, 1.8, 4.8);
        obj.GetPerimeter();
        obj.GetArea();
        obj.NewColor();
        obj2.GetPerimeter();
        obj2.GetArea();
        obj2.NewColor();
    }
}