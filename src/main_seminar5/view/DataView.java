package main_seminar5.view;

import main_seminar5.model.HomeworkStudentGroup;
import main_seminar5.model.Student;
import main_seminar5.model.Teacher;

public class DataView {
    public void printOnConsole(Student student){
        System.out.println(student);
    }
    public void printOnConsole(Teacher teacher){
        System.out.println(teacher);
    }
    public void printOnConsole(HomeworkStudentGroup studentGroup){
        System.out.println(studentGroup);
    }
}
