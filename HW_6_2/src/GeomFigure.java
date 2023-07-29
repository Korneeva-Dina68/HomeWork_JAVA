public abstract class GeomFigure {
    double a, b;
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
        obj.GetPerimeter();
        obj.GetArea();
        obj.NewColor();
        Triangle obj2 = new Triangle(4.0, 3.0, 1.8, 4.8);
        obj2.GetPerimeter();
        obj2.GetArea();
        obj2.NewColor();
        Polygon obj3 = new Polygon(4, 5, 3, 5);
        obj3.GetPerimeter();
        obj3.GetArea();
        obj3.vertexes();
        Romb obj4 = new Romb(3, 3, 3, 3);
        obj4.GetPerimeter();
        obj4.GetArea();
        obj4.BigSmall();
    }
}