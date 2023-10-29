package main_seminar5;

import main_seminar5.controller.Controller;
import main_seminar5.model.Teacher;

import java.util.List;

public class HomeworkMain {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("student1",
                "student1", "student1");
        controller.createStudent("student2",
                "student2", "student2");
        controller.createStudent("student3",
                "student3", "student3");

        controller.createTeacher("teacher1",
                "teacher1", "teacher1");
        controller.createTeacher("teacher2",
                "teacher2", "teacher2");

        List<Teacher> teacherList = controller.getListTeacher();

        controller.createStudentGroup(teacherList.get(1), controller.getListStudent());
        controller.createStudentGroup(teacherList.get(0), controller.getListStudent());

        controller.printStudentGroups();
    }
}
