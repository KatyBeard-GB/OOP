package main_seminar5;

import main_seminar5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("student1",
                "student1", "student1");
        controller.createStudent("student2",
                "student2", "student2");
        controller.createStudent("student3",
                "student3", "student3");

        controller.printAllStudent();
    }
}
