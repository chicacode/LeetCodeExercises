package Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import Ingredient.Ingredient;

public class Recipe {
    private final String name;
    private ArrayList<Ingredient> ingredients;
    private String instructions;
    private Category recipeCategory;
    private double totalCalories;
    

    public Recipe(String name, List<Ingredient> ingredients, String instructions, Category recipCategory, double totalCalories) {
        this.name = name;
        this.ingredients = (ArrayList<Ingredient>) ingredients;
        this.instructions = instructions;
        this.recipeCategory = recipCategory;
        this.totalCalories = totalCalories;
    }

    public String getName() {
        return this.name;
    }

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = (ArrayList<Ingredient>) ingredients;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Category getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(Category recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public double getTotalCalories(){
        return totalCalories;
    }
    
    public void setTotalCalories(Double totalCalories) {
        this.totalCalories = totalCalories;
    }
}
