public class Lesson_4_1 {
    public static void main(String[] args) {
        Student obj = new Student("Вася", 36, "ТГТУ", 527, 4.7, "Алгебра");
        Student obj1 = new Student("Лена", 28, "ТГТУ", 828, 4.9, "Физика");
        obj.setNumber(333);
        obj.setMark(3.2);
        System.out.println(obj.getSubject());
        System.out.println(obj.getNumber());
        System.out.println(obj.getMark());
    }
}
    class Student {
        public String name;
        public int age;
        public String University;
        private int number;
        private double mark;
        private String subject;

        Student(String name, int age, String University, int number, double mark, String subject) {
            this.name=name;
            this.age=age;
            this.University=University;
            this.number=number;
            this.mark=mark;
            this.subject=subject;
        }

        public void setNumber(int number) {
            this.number=number;
        }
        public int getNumber() {
            return number;
        }

        public void setMark(double mark) {
            this.mark=mark;
        }
        public double getMark() {
            return mark;
        }
        public String getSubject() {
            return subject;
        }
    }
