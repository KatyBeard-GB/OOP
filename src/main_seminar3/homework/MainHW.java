package main_seminar3.homework;

import main_seminar3.Student;
import main_seminar3.StudentGroup;
import main_seminar3.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainHW {
    static String[] name = {"Test1", "Test2", "Test3", "Test4",
                "Test5", "Test6", "Test7", "Test8"};
    static Teacher[] teachers;

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1", "teacher1",
                "teacher1", 1);
        Teacher teacher2 = new Teacher("teacher2", "teacher2",
                "teacher2", 2);
        Teacher teacher3 = new Teacher("teacher3", "teacher3",
                "teacher3", 3);

        teachers = new Teacher[]{teacher1, teacher2, teacher3};

        Stream stream1 = new Stream(randomStream(4));
        Stream stream2 = new Stream(randomStream(5));
        Stream stream3 = new Stream(randomStream(3));
        Stream stream4 = new Stream(randomStream(5));

        streamIterator(stream1);
        System.out.println("------");
        streamIterator(stream2);
        System.out.println("------");

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);
        streams.add(stream4);

        System.out.println(streams);

        streams.sort(new SteamComparator());

        System.out.println("------");
        System.out.println(streams);
    }

    public static void streamIterator(Stream stream){
        Stream streamIterator = new Stream(stream.getStudentGroupList());
        while (streamIterator.hasNext()){
            System.out.println(streamIterator.next());
        }
    }

    public static List<StudentGroup> randomStream(int countStudentGroup){
        List<StudentGroup> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countStudentGroup; i++) {
            StudentGroup studentGroup = new StudentGroup(randomStudentGroup(random.nextInt(1, 10)),
                    teachers[random.nextInt(0, teachers.length)], i + 1);
            result.add(studentGroup);
        }
        return result;
    }

    public static List<Student> randomStudentGroup(int countStudent){
        List<Student> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countStudent; i++) {
            Student student = new Student(name[random.nextInt(0, name.length)],
                    name[random.nextInt(0, name.length)],
                    name[random.nextInt(0, name.length)], i + 1);
            result.add(student);
        }
        return result;
    }


}
