package staff.management;

import staff.Employee;

public class Director extends Manager {
    private double budget;

    public Director(String name, String niNumber, double salary, String departName, double budget) {
        super(name, niNumber, salary, departName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return this.getSalary() * 0.02;
    }

}
