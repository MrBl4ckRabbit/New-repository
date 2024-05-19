package task_1.animals;

import java.util.Objects;

public class Whale extends Mammal {
    Mammal.Backbone backbone = new Mammal.Backbone();
    Water water;

    public Whale() {
    }

    public Whale(Backbone backbone) {
        this.backbone = backbone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whale whale)) return false;
        return Objects.equals(backbone, whale.backbone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(backbone);
    }
}

