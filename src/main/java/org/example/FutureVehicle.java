package org.example;

class FutureVehicle implements Vehicle {

    private String description;

    public FutureVehicle(String description) {
        this.description = description;
    }

    //Client cannot choose the color for futureVehicle.
    //It is unshared flyweight/
    //So, we ignore the client input.

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + "a blue (default) color.");
    }
}
