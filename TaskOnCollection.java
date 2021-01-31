/*
A field grades of type HashMap<String, Double> is declared in the class Solution , where
a key - first name and last name of student and a value - his average mark.
Create a methods:

printStudents, which prints only names of students (the key of collection);
getAverageMark, which returns an average marks of all students.
*/


package TasksOnJava;
import java.util.HashMap;
public class TaskOnCollection {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for(String key: grades.keySet()) {
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        double Sum = 0;
        int n=0;
        for(String key: grades.keySet()) {
            double value = grades.get(key);
            Sum = Sum + value;
            n++;
        }
        double AvgValue = (double) Sum /n;
        return AvgValue;
    }

}
