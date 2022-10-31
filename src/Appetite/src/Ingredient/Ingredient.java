package Ingredient;
import java.util.List;
import java.util.ArrayList;
import Enums.Unit;

public class Ingredient {
    private String name;
    private int amount;
    Unit unit;
    List<String> ingList = new ArrayList<>();

    public Ingredient(String name, int amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<String> AddIngredient(ArrayList<String> ingList){
        ArrayList listIng = new ArrayList<>(20);
        ingList.add(name);
        ingList.add(name);
        ingList.add(name);
        ingList.add(name);
        listIng.add(ingList);
        return listIng;
    }
}
