
import java.util.Scanner;

public class AdventuresOfCarrot {

    private final Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        AdventuresOfCarrot carrot = new AdventuresOfCarrot();
        carrot.run();
        // System.out.println("hello world");
    }

    private void run() {


        System.out.println();
        System.out.println("Welcome to the Adventures of Carrot!");
        System.out.println();
        System.out.println("Choose seed: Orange, Yellow, Purple");
        String seedChoice = userInput.nextLine();
        if (seedChoice.equalsIgnoreCase("orange")) {                       //implement try catch for null pointer or invalid type & logger to create story
            System.out.println("You chose an Orange carrot seed!");
        } else if (seedChoice.equalsIgnoreCase("yellow")) {
            System.out.println("You chose a Yellow carrot seed!");
        } else if (seedChoice.equalsIgnoreCase("purple")) {
            System.out.println("You chose a Purple carrot seed!");
        } else {
            System.out.println("Please choose a color");
        }
        System.out.println();
        System.out.println("Do you want to plant your seed next to the Tomatoes or Dill?");
        String plantingChoice = userInput.nextLine();
        if (plantingChoice.equalsIgnoreCase("tomatoes")) {
            System.out.println("Great choice! Carrots love tomatoes!");
        } else if (plantingChoice.equalsIgnoreCase("dill")) {
            System.out.println("This must be your first time...");
        } else {
            System.out.println("Please choose a location");
        }
        System.out.println();
        System.out.println("You should probably water your seed..");
        System.out.println("Water seed? (Y / N)");
        String waterSeed = userInput.nextLine();
        if (waterSeed.equalsIgnoreCase("y")) {
            System.out.println("Ah, refreshing");
        } else if (waterSeed.equalsIgnoreCase("n")) {
            System.out.println("Aw, your carrot died. No adventure.");
            System.exit(0);
        } else {
            System.out.println("Please choose an option");
        }
        System.out.println();
        System.out.println("--70 DAYS LATER--");
        System.out.println();
        System.out.println("Your carrot is ready to harvest!!");
        System.out.println("Harvest carrot? (Y / N)");
        String harvestChoice = userInput.nextLine();
        if(harvestChoice.equalsIgnoreCase("y") && plantingChoice.equalsIgnoreCase("tomatoes")){
            System.out.println("Pull!");
            System.out.println("Pull!");
            System.out.println("POP");
            System.out.println("WOW that's a good looking carrot!");
        } else if (harvestChoice.equalsIgnoreCase("y") && plantingChoice.equalsIgnoreCase("dill")){
            System.out.println("Pull!");
            System.out.println("Pull!");
            System.out.println("POP");
            System.out.println("its... tiny");
        } else if (harvestChoice.equalsIgnoreCase("n")){
            System.out.println("Welp. Your carrot was eaten by Armadillidiidae. No carrot adventures.");
            System.exit(0);
        }
        System.out.println();
        System.out.println("Hey look! Your carrot has legs! Funny when they do that.");
        System.out.println("Oh! Arms too!");
        System.out.println("Wait! A face!?!");
        System.out.println("Your carrot has a face!!");
        System.out.println();
        System.out.println("What would you like to name your carrot?");
        String name = userInput.nextLine();
        System.out.println();
        System.out.println("***~ THE ADVENTURES OF " + name.toUpperCase() + " THE " + seedChoice.toUpperCase() + " CARROT ~***");
        System.out.println();


    }
}

