package main_seminar6_homework.service;

import main_seminar3.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IUserService<Student> {
    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Student student :
                students) {
            if (maxId < student.getStudentId()){
                maxId = student.getStudentId();
            }
        }
        Student student = new Student(firstName, secondName, lastName, ++maxId);
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
