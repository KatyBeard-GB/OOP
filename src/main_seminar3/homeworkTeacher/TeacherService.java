package main_seminar3.homeworkTeacher;

import main_seminar3.data.Teacher;
import main_seminar3.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements IUserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher teacher :
                teachers) {
            if (maxId < teacher.getTeacherId()){
                maxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, secondName, lastName, ++maxId);
        teachers.add(teacher);
    }

    public void create(String firstName, String secondName, String lastName, int id) {
        boolean statusId = false;
        for (Teacher teacher :
                teachers) {
            if (teacher.getTeacherId() == id){
                statusId = true;
            }
        }
        if (!statusId){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            teachers.add(teacher);
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}
