package org.example;

public class Main {
    public static void main(String[] args) {
        // Strategy pattern
        System.out.println("*** Strategy pattern ***\n");
        Vehicle vehicle = new Vehicle("airplane");
        VehicleSupervisor supervisor = new VehicleSupervisor(new InitialBehaviour());
        supervisor.displayDetail(vehicle);

        System.out.println("Setting flying capability to it.");
        supervisor.setVehicleBehaviour(new FlyBehaviour());
        supervisor.displayDetail(vehicle);

        System.out.println("Changing the vehicle behaviour again");
        supervisor.setVehicleBehaviour(new FloatBehaviour());
        supervisor.displayDetail(vehicle);
    }
}
