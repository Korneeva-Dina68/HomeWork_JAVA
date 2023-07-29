import java.awt.Dimension;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.io.File;

public class Person extends JFrame{
    String name, surname;
    int age, number;

    Person(String name, String surname, int age, int number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
    }
    static Person person = new Person("Ольга", "Иванова", 26, 111111);
    public static void table(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames = {
                "Имя",
                "Фамилия",
                "Возраст",
                "Номер телефона"
        };

        Object[][] data = {
                {"Ольга", "Иванова", 26, 111111},
                {"Федор", "Краснов", 18, 222222},
                {"Катя", "Петрова", 33, 333333},
                {"Лена", "Сидорова", 24, 444444},
                {"Коля", "Потапов", 61, 555555},
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void save(String filename) throws IOException {
       try (
           OutputStream out = new FileOutputStream(filename);
           Writer file = new OutputStreamWriter(out);
       ) {
           file.write(String.valueOf(person));
       }
    }
    public void load(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        var line = reader.readLine();
        reader.close();
        System.out.println(line);
    }
    public static void main (String[] args) throws IOException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                table();
            }
        });
        File filename = new File("C:\\Users\\zmeya\\Java\\HW_8_2\\src\\people.csv");
        person.save(String.valueOf(filename));
        person.load(String.valueOf(filename));
    }

}
