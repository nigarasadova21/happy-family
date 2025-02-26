package az.edu.turing.enums;

public enum Species {
    DOG(true, 4, true), CAT(false, 4, true), PARROT(true, 2, false), FISH(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Species{" +
                "canFly=" + canFly +
                ", numberOfLegs=" + numberOfLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}
