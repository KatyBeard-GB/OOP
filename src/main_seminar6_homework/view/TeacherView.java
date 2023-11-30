package main_seminar6_homework.view;

import main_seminar3.data.Teacher;
import main_seminar3.view.IUserView;

import java.util.List;

public class TeacherView implements IUserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher teacher :
                teachers) {
            System.out.println(teacher);
        }
    }
}
