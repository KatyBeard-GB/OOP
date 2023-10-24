package main_seminar3.view;

import main_seminar3.data.Student;

import java.util.List;

public class StudentView implements IUserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student :
                list) {
            System.out.println(student);
        }
    }
}
