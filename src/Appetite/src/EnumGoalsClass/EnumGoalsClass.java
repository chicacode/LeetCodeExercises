package EnumGoalsClass;

import java.util.Scanner;

import Enums.GoalsOption;

public class EnumGoalsClass {
    GoalsOption goal;

    public EnumGoalsClass(GoalsOption goal) {
        this.goal = goal;
    }

    public GoalsOption getGoal() {
        return this.goal;
    }

    public GoalsOption setGoal(GoalsOption goal) {
        try (Scanner input = new Scanner(System.in)) {
            char option;

            System.out.println("Please select your goal:");
            System.out.println("A. Increase Muscle");
            System.out.println("B. Lose Fat");

            System.out.println("Select a choice: ");

            option = input.next().charAt(0);

            if(option == 'A'){
                System.out.println("A. Increase Muscle");
                return this.setGoal(GoalsOption.A);
            }else{
                System.out.println("B. Lose Fat");
                return this.setGoal(GoalsOption.B);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }

        return this.goal;
    }

}
