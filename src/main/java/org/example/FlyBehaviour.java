package org.example;

public class FlyBehaviour implements VehicleBehaviour{
    @Override
    public void showDetails(Vehicle vehicle) {
        System.out.println("The "+vehicle.getVehicle()+" can fly now.\n");
    }
}
