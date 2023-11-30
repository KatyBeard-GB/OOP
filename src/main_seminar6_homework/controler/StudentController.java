package main_seminar6_homework.controler;

import main_seminar3.data.Student;
import main_seminar3.service.StudentService;
import main_seminar3.view.StudentView;

import java.util.List;

// Пример использования принципов LSP и DIP
public class StudentController implements IUserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    public void printAllStudents(){
        studentView.sendOnConsole(getAllStudents());
    }
}
