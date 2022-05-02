package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.aviary.Aviary;

import java.util.List;

public class Zoo {

    private List<Aviary<? extends Animal>> aviaries;

    public Zoo(List<Aviary<? extends Animal>> list) {
        this.aviaries = list;
    }

    public List<Aviary<? extends Animal>> getAviaries() {
        return aviaries;
    }
}
