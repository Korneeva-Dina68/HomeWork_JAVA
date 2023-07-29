import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Stream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;
        StringBuilder sb = new StringBuilder();
        try {
            isr = new InputStreamReader(System.in);
            System.out.println("Введите текст на латинице. Для выхода нажмите 0:");
            char c;
            while (true){
                c = (char) isr.read();
                if (c == '0')
                {break;}
                sb.append(c);}
                System.out.print(c);
            } finally {
            if (isr != null) {
                isr.close();
            }
        }
        String a = sb.toString();
        String [] b = a.split(" ");
        System.out.println(b.length);
        for (int i = 0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
