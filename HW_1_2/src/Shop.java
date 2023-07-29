public class Shop {
    static double Watermelon = 250;
    static double Melon = 100;
    static double PriceWatermelon = 10;
    static double PriceMelon = 25;

    public static void main (String[] args){
        PayWatermelon(200);
        PayMelon(80);
        PayWatermelonAndMelon(200, 80);
        NewPriceWatermelon();
        NewPriceMelon();
        Quantity(200, 80);
        Cost();
    }
    private static void PayWatermelon(double x) {
        if (x <= Watermelon) {
            System.out.println("Есть данное количество арбузов на остатке");
        } else {
            System.out.println("Нет данного количества арбузов на остатке");
        }
        System.out.println("Продано " + x + " килограмм арбузов. На остатке осталось " + (Watermelon-x) + " килограмм арбузов");
    }
    private static void PayMelon(double y) {
        if (y <= Melon) {
            System.out.println("Есть данное количество дынь на остатке");
        } else {
            System.out.println("Нет данного количества дынь на остатке");
        }
        System.out.println("Продано " + y + " килограмм дынь. На остатке осталось " + (Melon-y) + " килограмм дынь");
    }
    private static void PayWatermelonAndMelon (double x, double y) {
        if (x<=Watermelon&&y<=Melon) {
            System.out.println("Есть данное количество дынь и арбузов на остатке");
        } else if (x>Watermelon&&y<=Melon) {
            System.out.println("Нет данного количества арбузов на остатке");
        } else if (x>Watermelon&&y>Melon) {
            System.out.println("Нет данного количества дынь и арбузов на остатке");
        } else if (x<=Watermelon&&y>Melon) {
            System.out.println("Нет данного количества дынь на остатке");
        }
        System.out.println("Продано " + x + " килограмм арбузов и " + y + " килограмм дынь. На остатке осталось " + (Watermelon-x) + " килограмм арбузов и " + (Melon-y) + " килограмм дынь");
    }
    public static void NewPriceWatermelon(){
        Shop.PriceWatermelon=15;
        System.out.println("Новая цена арбуза-" + Shop.PriceWatermelon + " рублей");
    }
    public static void NewPriceMelon() {
        Shop.PriceMelon=30;
        System.out.println("Новая цена дыни-" + Shop.PriceMelon + " рублей");
    }
    public static void Quantity(int x, int y) {
        System.out.println("Всего на остатке " + (Watermelon+Melon-(x+y)) + " килограмм.");
    }
    public static void Cost() {
        System.out.println("Сумма вашего заказа: " + ((Watermelon*PriceWatermelon)+(Melon*PriceMelon)) + " рублей.");
    }
}