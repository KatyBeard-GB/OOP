package main_seminar5.service;

import main_seminar5.model.HomeworkStudentGroup;
import main_seminar5.model.Student;
import main_seminar5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HomeworkStudentGroupService {
    private List<HomeworkStudentGroup> studentGroupsList;

    public HomeworkStudentGroupService() {
        this.studentGroupsList = new ArrayList<>();
    }

    /***
     * Получить последний неиспользуемый Id группы
     * @return Id группы
     */
    private int getId(){
        int result = 1;
        for (HomeworkStudentGroup studentGroup :
                studentGroupsList) {
            result = studentGroup.getStudentGroupId() + 1;
        }
        return result;
    }

    /***
     * Создание учебной группы
     * @param teacher Учитель
     * @param studentList Список студентов
     */
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        HomeworkStudentGroup studentGroup = new HomeworkStudentGroup(teacher, studentList, getId());
        studentGroupsList.add(studentGroup);
    }

    /***
     * Получить группу по Id
     * @param id Id группы
     * @return Учебная группа (StudentGroup)
     */
    public HomeworkStudentGroup getStudentGroupById(int id){
        for (HomeworkStudentGroup studentGroup :
                studentGroupsList) {
            if (studentGroup.getStudentGroupId() == id)
                return studentGroup;
        }
        return null;
    }

    /***
     * Получить все созданные учебные группы
     * @return Список учебных групп (List<HomeworkStudentGroup>)
     */
    public List<HomeworkStudentGroup> getAllStudentGroups(){
        return studentGroupsList;
    }
}
