package main_seminar3;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    public void zeroCounter(){
        counter = 0;
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        studentList.remove(--counter);
    }
}
