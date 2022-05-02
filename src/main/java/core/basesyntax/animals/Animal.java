package core.basesyntax.animals;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}
