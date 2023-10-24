package main_seminar3.homeworkTeacher;

import main_seminar3.data.Teacher;

public class MainHWTeacher {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        teacherController.create("teacher1", "teacher1",
                "teacher1");
        teacherController.create("teacher2", "teacher2",
                "teacher2");
        teacherController.create("teacher3", "teacher3",
                "teacher3");
        teacherController.create("teacher4", "teacher4",
                "teacher4");

        teacherController.printAllTeachers();

        Teacher teacherEdit = teacherController.getAllTeachers().get(0);
        teacherController.edit(teacherEdit, "teacher1417",
                "teacher1722", "teacher1");
        teacherController.edit("teacher3", "teacher3", "teacher3",
                "Ivan", "teacher23", "teacher3");
        teacherController.edit(5, "teacher56", "teacher56", "teacher56");
        System.out.println("-----");
        teacherController.printAllTeachers();

    }
}
