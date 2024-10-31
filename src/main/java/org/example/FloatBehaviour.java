package org.example;

public class FloatBehaviour implements VehicleBehaviour{
    @Override
    public void showDetails(Vehicle vehicle) {
        System.out.println("The "+ vehicle.getVehicle()+" can float now.\n");
    }
}
