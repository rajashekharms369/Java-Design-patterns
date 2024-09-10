package org.example;

class JuniorEmployee extends Employee{

    public JuniorEmployee(String name, String designation){
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println(this.name+" is a "+this.designation);
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
