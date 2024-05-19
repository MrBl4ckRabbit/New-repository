package task_1.vehicles.transports;

import task_1.vehicles.interfaces.Shippable;
import task_1.vehicles.properties.Propeller;
import task_1.vehicles.properties.Wheel;
import task_1.vehicles.properties.Wing;

public class Plane implements Shippable {
     Wheel wheel;
     Propeller propeller;
     Wing wing;

    public Plane(Wheel wheel, Propeller propeller, Wing wing) {
        this.wheel = wheel;
        this.propeller = propeller;
        this.wing = wing;
    }
}
