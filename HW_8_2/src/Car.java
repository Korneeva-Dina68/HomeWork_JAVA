import java.io.*;
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String color;
    int maxSpeed;
    String country;

    Car(String name, String color, int maxSpeed, String country) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }
    static Car car = new Car("Лада", "красный", 150, "Россия");
    @Override
    public String toString() {
        return "Характеристики: марка авто " + name + ", цвет " + color + ", макс.скорость " + maxSpeed + ", страна производства " + country + ".";
    }

    public void save(String filename) throws IOException {
        PrintWriter writer = new PrintWriter(filename);
        writer.println(car);
        writer.close();
    }

    public void load(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String line = reader.readLine();
        reader.close();
        System.out.println(line);
    }

    public static void main(String[] args) throws IOException {
        File filename = new File("C:\\Users\\zmeya\\Java\\HW_8_2\\src\\filename.txt");

        car.save(String.valueOf(filename));
        car.load(String.valueOf(filename));
    }
}
