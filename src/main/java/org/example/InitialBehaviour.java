package org.example;

public class InitialBehaviour implements VehicleBehaviour{
    @Override
    public void showDetails(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicle() + " is in born state.\n");
        System.out.println("It cannot do anything special");
    }


}
