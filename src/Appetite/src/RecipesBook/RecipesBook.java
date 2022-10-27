package RecipesBook;
import java.util.ArrayList;
import Recipe.Recipe;

public class RecipesBook {
    private ArrayList<Recipe> bookOfRecipes = new ArrayList<>();


    public RecipesBook() {
    }


    public RecipesBook(ArrayList<Recipe> bookOfRecipes) {
        this.bookOfRecipes = bookOfRecipes;
    }


    public ArrayList<Recipe> getBookOfRecipes() {
        return this.bookOfRecipes;
    }

    public void setBookOfRecipes(ArrayList<Recipe> bookOfRecipes) {
        this.bookOfRecipes = bookOfRecipes;
    }

    public void addRecipe(){
        System.out.println("recipe added");
    }

    public void updateRecipe(){
         System.out.println("recipe added");
    }
}
