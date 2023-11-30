package main_seminar6_homework;

import main_seminar6_homework.controler.StudentController;

public class Main {
    public static void main(String[] args) {
        // Семинар 4
        StudentController studentController = new StudentController();

        studentController.create("Test1", "Test123",
                "Test1");
        studentController.create("Test2", "Test122",
                "Test2");
        studentController.create("Test3", "Test3",
                "Test3");
        studentController.create("Test4", "Test4",
                "Test4");

        studentController.printAllStudents();

    }

}
