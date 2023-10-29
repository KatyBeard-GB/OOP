package main_seminar5.model;

import java.util.List;

public class HomeworkStudentGroup {
    private Teacher teacher;
    private final List<Student> studentList;
    private int studentGroupId;

    public HomeworkStudentGroup(Teacher teacher, List<Student> studentList, int studentGroupId) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.studentGroupId = studentGroupId;
    }

    public int getStudentGroupId() {
        return studentGroupId;
    }

    public void setStudentGroupId(int studentGroupId) {
        this.studentGroupId = studentGroupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentGroupId=" + studentGroupId +
                ", teacherId=" + teacher.getTeacherId() +
                ", numberOfStudents=" + studentList.size() +
                '}';
    }
}
