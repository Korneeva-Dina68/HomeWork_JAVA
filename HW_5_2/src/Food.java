import java.util.Date;

public class Food extends Product{
     Date date;
    public Food(String title, int price, Date date){
        super(title, price);
        this.date = date;
    }
    @Override
    public String toString() {

        return "{" + this.title + "," + this.price + "," + this.date + '}';
    }
}
