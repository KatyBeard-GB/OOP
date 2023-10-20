package main_seminar2;

public abstract class Actor implements IActorBehavoir {
    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
