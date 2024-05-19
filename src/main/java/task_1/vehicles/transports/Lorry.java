package task_1.vehicles.transports;

import task_1.vehicles.interfaces.Shippable;
import task_1.vehicles.properties.Wheel;

public class Lorry implements Shippable {
     Wheel wheel;

    public Lorry(Wheel wheel) {
        this.wheel = wheel;
    }
}
