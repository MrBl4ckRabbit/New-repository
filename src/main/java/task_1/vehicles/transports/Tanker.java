package task_1.vehicles.transports;

import task_1.vehicles.interfaces.Shippable;
import task_1.vehicles.properties.Propeller;

public class Tanker implements Shippable {
     Propeller propeller;

    public Tanker(Propeller propeller) {
        this.propeller = propeller;
    }
}
