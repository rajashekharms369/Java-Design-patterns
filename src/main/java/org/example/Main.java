package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Flyweight design pattern
        System.out.println("*** Flyweight pattern demo ***\n");

        VehicleFactory vehicleFactory = new VehicleFactory();

        createVehicles("car", 3, vehicleFactory);

        createVehicles("bus", 5, vehicleFactory);

        createVehicles("future", 2, vehicleFactory);

        /*
        we are trying to get the 5 vehicles.
        Note that: we need not create additional
        vehicles if we have already created one of these categories.
         */

        private static void createVehicles(String vehicleType, int count, VehicleFactory vehicleFactory) throws Exception{
            int distanceVehicles;
            for(int i=0; i<count; i++) {
                Vehicle vehicle = vehicleFactory.getVehicleFromFactory(vehicleType);
                vehicle.aboutMe(getRandomColor());
            }
            distinctVehicles = vehicleFactory.totalObjectsCreated();
            System.out.println("\n\tDistinct vehicles in this application: "+distinctVehicles);
            System.out.println("----------");
        }

        static String getRandomColor(){
            Random r = new Random();
            int random = r.nextInt();
            if(random % 2 == 0){
                return "red";
            }
            else{
                return "green";
            }
        }
    }
}
