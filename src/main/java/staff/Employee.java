package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public String setName(String name) {
        if (name.length() >=1) {
            this.name = name;
            return name;
        }
        else {
            return "name cannot be null";
        }
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary() {
        if(salary > 0) {
            return salary * 1.05;
        }
        else {
            return salary;
        }
    }

    public double payBouns() {
        return salary * 0.01;
    }

}
