package task_1.animals;

import java.util.Objects;

public class Fish extends Animal {
    private Water water;

    public Fish() {
    }

    public Fish(Water water, String kind, String name) {
        super();
        this.water = new Water();
        this.kind = kind;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish fish)) return false;
        return Objects.equals(water, fish.water) && Objects.equals(kind, fish.kind) && Objects.equals(name, fish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, kind, name);
    }
}
