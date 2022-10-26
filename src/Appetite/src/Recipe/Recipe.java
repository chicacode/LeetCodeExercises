package Recipe;

import java.util.List;
import java.util.Locale.Category;

import Ingredient.Ingredient;

public class Recipe {
    private final String name;
    private List<Ingredient> ingredients;
    private String instructions;
    private Category recipeCategory;
    

    public Recipe(String name, List<Ingredient> ingredients, String instructions, Category recipCategory) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.recipeCategory = recipCategory;
    }


    public String getName() {
        return this.name;
    }

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
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

    
}
