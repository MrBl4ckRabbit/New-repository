package task_1.animals;

import java.util.Objects;

public class Cat extends Mammal {
    static class Fur {

    }

    public Cat() {
    }

    public Cat(String kind, String name) {
        super();
        Fur fur = new Fur();
        this.kind = kind;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(kind, cat.kind) && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name);
    }
}
