package main_seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Test1", "Test123",
                "Test1", 1);
        Student student2 = new Student("Test2", "Test122",
                "Test2", 2);
        Student student3 = new Student("Test3", "Test3",
                "Test3", 3);
        Student student4 = new Student("Test4", "Test4",
                "Test4", 4);

        Teacher teacher = new Teacher("t", "t", "t", 5);

        List<Student> list = new ArrayList<>();
        list.add(student3);
        list.add(student1);
        list.add(student4);
        list.add(student2);

        // Сортировка с помощью Comparator
        list.sort(new StudentComparator());

        // Сортировка с помощью Comparable
//        Collections.sort(list);

        StudentGroup studentGroups = new StudentGroup(list, teacher, 1);

        // Перебор с помощью интерфейса Iterable
        for (Student student :
                studentGroups) {
            System.out.println(student);
        }

//        testIterator(studentGroups);
    }

    public static void testIterator(StudentGroup studentGroup){
        StudentGroupIterator groupIterator
                = new StudentGroupIterator(studentGroup);
        while (groupIterator.hasNext()){
            System.out.println(groupIterator.next());
        }
    }
}
