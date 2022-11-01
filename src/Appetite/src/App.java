import Recipe.Recipe;
import User.User;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<String> arraylist_1 = new ArrayList<String>();
        System.out.println("Hello, welcome to Appetite!");
        System.out.println("Your recipe's management app");
        User user = new User(0, "unknown", 0, "unknown", 0, 0, 0, null, null, null, null, null);

        user.getUserInfo();

        // calculate calories base on bmi

        // get result

        // list of recipes
        // Recipe omelette = new Recipe(null, null, null, null, 0);
        // omelette.getName();

    }
}
