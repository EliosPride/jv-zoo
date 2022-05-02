package core.basesyntax.animals;

import core.basesyntax.animalopportunities.Swimable;

public abstract class Fish extends Animal implements Swimable {

    public Fish(String petName) {
        super(petName);
    }
}
