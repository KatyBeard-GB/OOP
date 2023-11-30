package main_seminar6.SRP;

public class EmployeeSalaryCalculate {
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return baseSalary * 1.5;
    }
}
