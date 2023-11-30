package main_seminar6_homework.view;

import main_seminar3.data.Student;

import java.util.List;

// Пример использования принципа DIP
public class StudentView implements IUserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student :
                list) {
            System.out.println(student);
        }
    }
}
