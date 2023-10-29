package main_seminar5.controller;

import main_seminar5.model.*;
import main_seminar5.service.DataService;
import main_seminar5.service.HomeworkStudentGroupService;
import main_seminar5.view.DataView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final DataView dataView = new DataView();
    HomeworkStudentGroupService studentGroupService = new HomeworkStudentGroupService();

    /***
     * Создание студента
     * @param firstName Имя
     * @param secondName Фамилия
     * @param lastName Отчество
     */
    public void createStudent(String firstName, String secondName,
                              String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    /***
     * Создание учителя
     * @param firstName Имя
     * @param secondName Фамилия
     * @param lastName Отчество
     */
    public void createTeacher(String firstName, String secondName,
                              String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    /***
     * Вывод в консоль всех студентов
     */
    public void printAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user:
             userList) {
            dataView.printOnConsole((Student) user);
        }
    }

    /***
     * Вывод в консоль всех учителей
     */
    public void printAllTeacher(){
        List<User> userList = dataService.getAllTeacher();
        for (User user:
                userList) {
            dataView.printOnConsole((Teacher) user);
        }
    }

    /***
     * Создание учебной группы в рамках ДЗ
     * @param teacher Учитель
     * @param studentList Список Студентов
     */
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroupService.createStudentGroup(teacher, studentList);
    }

    /***
     * Вывод в консоль списка всех созданных групп в рамках ДЗ
     */
    public void printStudentGroups(){
        List<HomeworkStudentGroup> studentGroupsList = studentGroupService.getAllStudentGroups();
        for (HomeworkStudentGroup studentGroup :
                studentGroupsList) {
            dataView.printOnConsole(studentGroup);
        }
    }

    /***
     * Вывод в консоль группы по Id в рамках ДЗ
     * @param id Id учебной группы
     */
    public void printStudentGroupById(int id){
        dataView.printOnConsole(studentGroupService.getStudentGroupById(id));
    }

    /***
     * Получить лист студентов
     * @return Список студентов (List<Student>)
     */
    public List<Student> getListStudent(){
        List<Student> result = new ArrayList<>();
        for (User user :
                dataService.getAllStudent()) {
            result.add((Student) user);
        }
        return result;
    }

    public List<Teacher> getListTeacher(){
        List<Teacher> result = new ArrayList<>();
        for (User user :
                dataService.getAllTeacher()) {
            result.add((Teacher) user);
        }
        return result;
    }
}
