public class Main {
    public static void main(String[] args) {
        int total_seconds = 2735;
        int hours = total_seconds / 3600;
        int minutes = (total_seconds - (hours * 3600)) / 60;
        int seconds = total_seconds - (hours * 3600) - (minutes * 60);

        System.out.println("CURRENT TIME: " + hours + " HOURS " + minutes + " MINUTES " + seconds + " SECONDS.");

        StringBuffer current_time2 = new StringBuffer("09:28:45");
        String hours2 = current_time2.substring(0, 2);
        String minutes2 = current_time2.substring(3, 5);
        String seconds2 = current_time2.substring(6, 8);
        int a = Integer.parseInt(hours2);
        int b = Integer.parseInt(minutes2);
        int c = Integer.parseInt(seconds2);
        int total_seconds2 = a*3600+b*60+c;
        System.out.println(total_seconds2 + " total seconds");
    }
}