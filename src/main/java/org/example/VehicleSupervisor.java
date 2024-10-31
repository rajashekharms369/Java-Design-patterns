package org.example;

public class VehicleSupervisor {
    VehicleBehaviour behaviour;

    public VehicleSupervisor(VehicleBehaviour behavior) {
        behaviour = behavior;
    }

    public void setVehicleBehaviour(VehicleBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void displayDetail(Vehicle vehicle) {
        behaviour.showDetails(vehicle);
    }
}
