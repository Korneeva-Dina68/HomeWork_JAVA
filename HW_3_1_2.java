public class Lesson2_2 {
    public static int askKatya(){
        int x=21;
        return x;
    }
    public static int askAnton(){
        int y=8;
        return y;
    }
    public static int askDima(){
        int z=10;
        return z;
    }
    public static void main(String[] args){
        int z=askDima();
        int y=askAnton();
        int x=askKatya();
        int d=14; //количество яблок у Ильи
        int sum=x + y + z + d;
        System.out.println(sum);
    }
}
