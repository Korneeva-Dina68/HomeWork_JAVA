public class Phone extends Product{
    public String maker;
    public Phone(String title, int price, String maker){
        super(title, price);
        this.maker = maker;
    }
    @Override
    public String toString() {

        return "{" + this.title + "," + this.price + "," + this.maker + '}';
    }
}