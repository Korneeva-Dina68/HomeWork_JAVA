public class Lesson2 {
    public static int askKatya(int x){
        return x;
    }
    public static int askAnton(int y){
        return y;
    }
    public static int askDima(int z){
        return z;
    }
    public static void main(String[] args){
        int askDima=askDima(5);
        int askAnton=askAnton(8);
        int askKatya=askKatya(21);
        int d=14;
        int sum=askKatya + askAnton + askDima + d;
        System.out.println(sum);
    }
}
