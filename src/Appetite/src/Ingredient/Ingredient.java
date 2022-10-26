package Ingredient;

import Enums.Unit;

public class Ingredient {
    private final String name;
    private int amount;
    Unit unit;

    public Ingredient(String name, int amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
