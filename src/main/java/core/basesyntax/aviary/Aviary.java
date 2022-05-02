package core.basesyntax.aviary;

import core.basesyntax.animals.Animal;

public abstract class Aviary<T extends Animal> {

    private T animal;

    public Aviary(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
