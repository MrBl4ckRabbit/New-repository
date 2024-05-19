package task_1.animals;

import java.util.Objects;

public class Bear extends Mammal {
    Mammal.Backbone backbone = new Mammal.Backbone();

    static class Fur {

    }

    public Bear() {
    }

    public Bear(Backbone backbone) {
        this.backbone = backbone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear bear)) return false;
        return Objects.equals(backbone, bear.backbone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(backbone);
    }
}
