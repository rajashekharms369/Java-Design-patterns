package org.example;

class SeniorEmployee extends Employee {

    public SeniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println(this.name + " is a " + this.designation);
        for(Employee e: subordinates){
            e.printStructures();
        }
    }

    @Override
    protected int getSubordinatesCount() {
        return 0;
    }

    @Override
    protected void addEmployee(Employee e) {

    }

    @Override
    protected void removeEmployee(Employee e) {

    }
}