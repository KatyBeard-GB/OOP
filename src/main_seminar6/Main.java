package main_seminar6;

import main_seminar6.DIP.Car;
import main_seminar6.DIP.DieselEngine;
import main_seminar6.DIP.PetrolEngine;
import main_seminar6.OCP.Bus;
//import main_seminar6.OCP.Car;
import main_seminar6.OCP.Vehicle;
import main_seminar6.SRP.Employee;
import main_seminar6.SRP.EmployeeSalaryCalculate;

public class Main {
    public static void main(String[] args) {
//        testSRP();
//        testOCP(new Vehicle(100, "Vehicle"));
//        testOCP(new Car(100));
//        testOCP(new Bus(100));
        testDIP();
    }

    static void testSRP(){
        // Принцип единственной ответственности
        // Для каждой реализации свой класс
        Employee employee = new Employee("Test", "qwertyu");
        // ...
        EmployeeSalaryCalculate calculate = new EmployeeSalaryCalculate(100);
        System.out.println(calculate.salaryCalculate());
    }

    static void testOCP(Vehicle vehicle){
        // Принцип закрытости и открытости
        // Различные модификации для транспортных средств
        System.out.println(vehicle.calculateMaxSpeed() + " " + vehicle.getType());
    }

    static void testDIP(){
        // Принцип инверсии зависимостей
        // Связь через абстракцию (интерфейс)
        Car car = new Car(new DieselEngine());
        car.start();
        car = new Car(new PetrolEngine());
        car.start();
    }
}
