package task_1.vehicles.transports;

import task_1.vehicles.interfaces.Shippable;
import task_1.vehicles.properties.Propeller;

public class Boat  implements Shippable {
    Propeller propeller;

    public Boat(Propeller propeller) {
        this.propeller = propeller;
    }
}
