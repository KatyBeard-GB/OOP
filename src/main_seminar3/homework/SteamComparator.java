package main_seminar3.homework;

import main_seminar3.StudentGroup;

import java.util.Comparator;

public class SteamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.getStudentGroupList().size() < o2.getStudentGroupList().size())
            return -1;
        if (o1.getStudentGroupList().size() > o2.getStudentGroupList().size())
            return 1;
        return 0;
    }
}
