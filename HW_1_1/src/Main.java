public class Main {
    public static void main(String[] args) {
        String name= "Alex";
        int start_money=115000;
        byte years=10;
        float rate=0.055f;
        double finish_money=(start_money * rate * years + start_money);

        System.out.println("Hello, " + name + ". " + "Your final balance: " + finish_money + " rubles.");
    }
}