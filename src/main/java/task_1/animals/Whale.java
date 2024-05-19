package task_1.animals;

import java.util.Objects;

public class Whale extends Mammal {
    private Water water;

    public Whale(Water water, String kind, String name) {
        super();
        this.water = new Water();
        this.kind = kind;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whale whale)) return false;
        return Objects.equals(water, whale.water) && Objects.equals(kind, whale.kind) && Objects.equals(name, whale.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, kind, name);
    }
}

