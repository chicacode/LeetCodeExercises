import User.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, welcome to Appetite!");
        System.out.println("Your recipe's management app");
        User user = new User(0, null, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null);

        user.getUserInfo();

    }
}
