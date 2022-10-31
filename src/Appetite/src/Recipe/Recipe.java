package Recipe;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import Ingredient.Ingredient;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>(20);;
    private String instructions;
    private Category recipeCategory;
    private double totalCalories;

    public Recipe(String name, List<Ingredient> ingredients, String instructions, Category recipCategory,
            double totalCalories) {
        this.name = "omelette";
        this.ingredients = (ArrayList<Ingredient>) ingredients;
        this.instructions = instructions;
        this.recipeCategory = recipCategory;
        this.totalCalories = totalCalories;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public void AddIngredient(Ingredient product) {
        ingredients.add(product);
    }

    public void getRecipeByCalories() {

        Scanner recipeData;
        try {
            recipeData = new Scanner(System.in);

            String name = recipeData.next();
            System.out.println("Recipe Name: " + name);
            System.out.println("Enter ingredient 1");
            // String ingredient1 = recipeData.next();

            // System.out.println("Enter ingredient 2");
            // String ingredient2 = recipeData.next();

            // System.out.println("Enter ingredient 3");
            // String ingredient3 = recipeData.next();

            // System.out.println("Enter ingredient 4");
            // String ingredient4 = recipeData.next();

            // ArrayList<String> ingredientsBackup = new ArrayList<String>(10);

            // ingredientsBackup.add(ingredient1);
            // ingredientsBackup.add(ingredient2);
            // ingredientsBackup.add(ingredient3);
            // ingredientsBackup.add(ingredient4);

            // System.out.println(" The ingredients of recipe are:");

            // System.out.println(ingredientsBackup);

            // System.out.println(" The instruction of recipe" + name + " is:");

            // System.out.println(" Step 1: Start by adding your sliced potatoes to hot
            // olive oil in a heavy pan. \nThey need to be fully covered in the oil");

            // System.out.println(" Step 2: While the potatoes are cooking, add the sliced
            // onions to a separate pan with a bit of olive oil");

            // System.out.println(" Step 3: When the potatoes are fully cooked some may
            // start to break apart");
            Recipe recipe001 = new Recipe(name, ingredients, instructions, recipeCategory, totalCalories);

            System.out.println("Your recipe is: " + recipe001);
            recipeData.close();

        } catch (Error e) {
            System.out.println("Error: " + e);
        }
    }

}
