public class Toy extends Product{
    public int age;
    public Toy(String title, int price, int age){
        super(title, price);
        this.age =age;
    }
    @Override
    public String toString() {

        return "{" + this.title + "," + this.price + "," + this.age + '}';
    }
}
