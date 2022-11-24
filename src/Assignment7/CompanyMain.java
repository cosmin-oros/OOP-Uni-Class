package Assignment7;

import java.util.ArrayList;

interface Strategy {
    public boolean isInCompany(Strategy strategy);
    public boolean isCondition(Employee e);
}

class ConditionName implements Strategy {


    @Override
    public boolean isInCompany(Strategy strategy) {

    }

    @Override
    public boolean isCondition(Employee e) {

    }
}

class ConditionMoney implements Strategy {


    @Override
    public boolean isInCompany(Strategy strategy) {

    }

    @Override
    public boolean isCondition(Employee e) {

    }
}

class Company implements Strategy{
    private ArrayList employees = new ArrayList();

    public Company() {

    }

    public void addEmployee(Employee e) {
        if (!employees.contains(e)) {
            employees.add(e);
        } else {
            System.out.println("Employee already stored")
        }
    }

    public void printEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }

    @Override
    public boolean isInCompany(Strategy strategy) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).isCondition()) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean isCondition(Employee e) {

    }
}

class Employee implements Strategy{
    private String name;
    private String type;
    private int personalID;
    private int flatSalary = 0;
    private int workedHours = 0;
    private double rate = 0.0;

    public Employee(String type, int s, String name, int id) {
        this.type = "flat";
        this.flatSalary = s;
        this.name = name;
        this.personalID = id;
    }

    public Employee(String type, double r, String name, int id) {
        this.type = "hourly";
        this.rate = r;
        this.name = name;
        this.personalID = id;
    }

    public void addWorkedHours(int hours) {
        this.workedHours += hours;
    }

    public double getSalary() {
        if ((this.type).equals("flat")) {
            return (double)flatSalary;
        } else {
            return (double) (rate * workedHours);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.personalID + " " + this.getSalary();
    }

    @Override
    public boolean isInCompany(Strategy strategy) {

    }

    @Override
    public boolean isCondition(Employee e) {

    }

}

class CompanyMain {
    public static void main(String[] args) {

    }
}