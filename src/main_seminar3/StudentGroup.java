package main_seminar3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private Teacher teacher;
    private int studentGroupId;

    public StudentGroup(List<Student> studentList, Teacher teacher, int studentGroupId) {
        this.studentList = studentList;
        this.teacher = teacher;
        this.studentGroupId = studentGroupId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "numberOfStudents=" + studentList.size() +
                ", " + teacher +
                ", studentGroupId=" + studentGroupId +
                '}';
    }
}
