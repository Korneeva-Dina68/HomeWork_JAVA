import java.util.Arrays;
import java.util.Date;
public class Shop {

    public static Product[] product = {new Product("платье", 1000), new Product("юбка", 500),new Phone("A80", 40000, "Samsung"), new Phone("10lite", 15000, "Honor"), new Toy("bear", 2000, 3),
            new Toy("doll", 1000, 6), new Food("milk", 150, new Date(1683799811554L)), new Food("eggs", 100, new Date(1683699811554L)), new Food("bread", 50, new Date(1683499811554L))};
    public static Product [] getProduct(int cost) {
        int j=0;
        for (int i = 0; i < product.length; i++) {
            if (cost >= product[i].price) {
                j++;
            }
        }
        Product[] new_array = new Product[j];
        int k = 0;
        for (int i = 0; i < product.length; i++) {
            if (cost >= product[i].price) {
                new_array[k] = product[i];
                k++;
            }
        }
        return new_array;
    }

    public static boolean containsProduct(String name) {
        boolean a = false;
        for (int i = 0; i < product.length; i++) {
            if (name.toLowerCase().equals(product[i].title.toLowerCase())) {
                a = true;
            }
        }
        return a;
    }

    public static Product findTheCheapest() {
        for (int i = 0; i < product.length; i++) {
            for (int j = 1; j < product.length; j++)
                if (product[i].price > product[j].price) {
                    Product x = product[i];
                    product[i] = product[j];
                    product[j] = x;
                }
        }
        return product[0];
    }
    public static Product[] findPhones(String maker) {
        int a=0;
        for (int i=0; i<product.length; i++){
            if (product[i] instanceof Phone && maker.equalsIgnoreCase(((Phone) product[i]).maker)) {
                a++;
            }
        }

        Product[] new_phone=new Product[a];
        int p=0;
        for (int i=0; i<product.length; i++) {
            if (product[i] instanceof Phone && maker.equalsIgnoreCase(((Phone) product[i]).maker)) {
                new_phone[p] = product[i];
                p++;
            }
        }
        return new_phone;
    }

    public static Product[] findToys(int age) {
        int a=0;
        for (int i=0; i<product.length; i++){
            if (product[i] instanceof Toy && age<=(((Toy) product[i]).age)) {
                a++;
            }
        }

        Product[] new_toys=new Product[a];
        int p=0;
        for (int i=0; i<product.length; i++) {
            if (product[i] instanceof Toy && age<=(((Toy) product[i]).age)) {
                new_toys[p] = product[i];
                p++;
            }
        }
        return new_toys;
    }
    public static Product[] findFood(Date date) {
        int a=0;
        for (int i=0; i<product.length; i++){
            if (product[i] instanceof Food && date.equals(((Food) product[i]).date)) {
                a++;
            }
        }

        Product[] new_food=new Product[a];
        int p=0;
        for (int i=0; i<product.length; i++) {
            if (product[i] instanceof Food && date.equals(((Food) product[i]).date)) {
                new_food[p] = product[i];
                p++;
            }
        }
        return new_food;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Shop.getProduct(600)));
        System.out.println(Shop.containsProduct("костюм"));
        System.out.println(Shop.findTheCheapest());
        System.out.println(Arrays.toString(Shop.findPhones("Honor")));
        System.out.println(Arrays.toString(Shop.findToys(2)));
        System.out.println(Arrays.toString(Shop.findFood(new Date(1683799811554L))));
    }

}