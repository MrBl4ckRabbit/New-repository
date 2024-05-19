package task_1.vehicles.transports;

import task_1.vehicles.interfaces.Shippable;
import task_1.vehicles.properties.Propeller;
import task_1.vehicles.properties.Wheel;

public class Helicopter implements Shippable {
     Wheel wheel;
     Propeller propeller;

    public Helicopter(Wheel wheel, Propeller propeller) {
        this.wheel = wheel;
        this.propeller = propeller;
    }
}
