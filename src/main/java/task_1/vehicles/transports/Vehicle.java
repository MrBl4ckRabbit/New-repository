package task_1.vehicles.transports;

public class Vehicle {
    Plane plane;
    Helicopter helicopter;
    Boat boat;
    Tanker tanker;
    Lorry lorry;
    Taxi taxi;

    public Vehicle(Plane plane) {
        this.plane = plane;
    }

    public Vehicle(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    public Vehicle(Boat boat) {
        this.boat = boat;
    }

    public Vehicle(Tanker tanker) {
        this.tanker = tanker;
    }

    public Vehicle(Lorry lorry) {
        this.lorry = lorry;
    }

    public Vehicle(Taxi taxi) {
        this.taxi = taxi;
    }
}
