package main_seminar6_homework.controler;

import main_seminar3.controler.IUserController;
import main_seminar3.data.Teacher;
import main_seminar3.homeworkTeacher.TeacherService;
import main_seminar3.homeworkTeacher.TeacherView;

import java.util.List;

// Пример использования принципа LSP
public class TeacherController implements IUserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public void edit(Teacher oldTeacher,
                     String newFirstName, String newSecondName, String newLastName){
        List<Teacher> teachers = getAllTeachers();
        boolean statusOldTeacher =  false;
        for (Teacher teacher :
                teachers) {
            if (teacher.equals(oldTeacher)){
                statusOldTeacher = true;
            }
        }
        if (statusOldTeacher){
            int idTeacher = oldTeacher.getTeacherId();
            teachers.remove(oldTeacher);
            teacherService.create(newFirstName, newSecondName, newLastName, idTeacher);
        }
    }

    public void edit(String oldFirstName, String oldSecondName, String oldLastName,
                     String newFirstName, String newSecondName, String newLastName){
        List<Teacher> teachers = getAllTeachers();
        for (Teacher teacher:
                teachers) {
            if (teacher.getFirstName().equals(oldFirstName) &&
                    teacher.getSecondName().equals(oldSecondName) &&
                    teacher.getLastName().equals(oldLastName)){
                edit(teacher, newFirstName, newSecondName, newLastName);
                break;
            }
        }

    }

    public void edit(int idEditTeacher,
                     String newFirstName, String newSecondName, String newLastName){
        List<Teacher> teachers = getAllTeachers();
        for (Teacher teacher:
                teachers) {
            if (teacher.getTeacherId() == idEditTeacher){
                edit(teacher, newFirstName, newSecondName, newLastName);
                break;
            }
        }
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAll();
    }

    public void printAllTeachers(){
        teacherView.sendOnConsole(getAllTeachers());
    }
}
