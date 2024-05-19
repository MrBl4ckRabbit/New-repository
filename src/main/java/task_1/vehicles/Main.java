package task_1.vehicles;

import task_1.vehicles.properties.Propeller;
import task_1.vehicles.properties.Wheel;
import task_1.vehicles.properties.Wing;
import task_1.vehicles.transports.Plane;
import task_1.vehicles.transports.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(new Plane(new Wheel(), new Propeller(), new Wing()));
    }
}
