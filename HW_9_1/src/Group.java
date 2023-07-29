import java.util.ArrayList;
import java.util.LinkedList;

public class Group <M> {
    private String course;
    private M number;
    public Group (M number, String course) {
        this.number = number;
        this.course = course;
    }
    static ArrayList<Student> students = new ArrayList<>();
    //static LinkedList<Student> students = new LinkedList<>();

    static Group<String> group = new Group<>("five", "biology");
    //static Group <Integer> group = new Group<>(7, "physics");

    static void main (String [] args) {
        Student student1 = new Student("Olga", 25);

        addStudent(student1);
        System.out.println(students);
        students.add(new Student("Vasya", 21));
        System.out.println(students);
        deleteStudent("Vasya");
        System.out.println(students);
        printGroup();
    }

    public static void addStudent(Student student){
        students.add(student);
    }

    public static void deleteStudent(String name){
        for (Student student: students)
            for (int i = 1; i<students.size(); i++) {
                if (student.name==name){
                    break;
                }
                students.remove(i);
            }
    }

    public static void printGroup() {
        System.out.println("Номер группы: " + group.number);
    }
}
