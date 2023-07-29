import java.util.ArrayList;

public class Student {
    public String name;
    public int age;
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name;
    }

}