package main_seminar5.service;

import main_seminar5.model.Student;
import main_seminar5.model.Teacher;
import main_seminar5.model.Type;
import main_seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    /***
     * Получить лист пользователей
     * @return лист пользователей (List<User>)
     */
    public List<User> getUserList() {
        return userList;
    }

    /***
     * Получение Id
     * @param type Либо студент, либо учитель
     * @return последний свободный Id (int)
     */
    private int getFreeId(Type type){
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user :
                userList) {
            if (user instanceof Teacher && !itsStudent)
                lastId = ((Teacher) user).getTeacherId() + 1;
            if (user instanceof Student && itsStudent)
                lastId = ((Student) user).getStudentId() + 1;
        }
        return lastId;
    }

    /***
     * Создание учителя либо студента
     * @param firstName Имя
     * @param secondName Фамилия
     * @param lastName Отчество
     * @param type Студент либо Учитель
     */
    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (type == Type.STUDENT){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (type == Type.TEACHER){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    /***
     * Поиск пользователя по Id
     * @param type Студент либо Учитель
     * @param id По какому Id искать
     * @return Пользователь (User)
     */
    public User getUserBuId(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        for (User user :
                userList) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == id)
                return user;
            if (user instanceof Student && ((Student) user).getStudentId() == id)
                return user;
        }
        return null;
    }

    /***
     * Получить список (List) всех студентов
     * @return список студентов (List<User>)
     */
    public List<User> getAllStudent(){
        List<User> studentList = new ArrayList<>();
        for (User user :
                userList) {
            if (user instanceof Student)
                studentList.add(user);
        }
        return studentList;
    }

    public List<User> getAllTeacher(){
        List<User> teacherList = new ArrayList<>();
        for (User user :
                userList) {
            if (user instanceof Teacher)
                teacherList.add(user);
        }
        return teacherList;
    }
}
