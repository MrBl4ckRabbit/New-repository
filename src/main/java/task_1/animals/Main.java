package task_1.animals;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("White Bear", "Tommy");
        Cat cat = new Cat("British", "Sparky");
        Fish fish = new Fish(new Water(), "Shark", "Sharky");
        Whale whale = new Whale(new Water(), "Killer Whale", "Willy");
    }
}
