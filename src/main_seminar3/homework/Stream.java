package main_seminar3.homework;

import main_seminar3.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int count;

    public Stream(List<StudentGroup> stream) {
        this.studentGroupList = stream;
        count = 0;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            return null;
        return studentGroupList.get(count++);
    }

    @Override
    public void remove() {
        studentGroupList.remove(--count);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "numberOfGroups=" + studentGroupList.size() +
                '}';
    }
}
