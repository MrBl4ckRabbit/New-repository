package task_1.animals;

import java.util.Objects;

abstract public class Animal extends Mammal {
    Mammal.Backbone backbone = new Mammal.Backbone();

    public Animal() {
    }

    public Animal(Backbone backbone) {
        this.backbone = backbone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(backbone, animal.backbone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(backbone);
    }
}
