package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String departName;

    public Manager(String name, String niNumber, double salary, String departName){
        super(name, niNumber, salary);
        this.departName = departName;
    }

    public String getDepartName() {
        return departName;
    }

}


