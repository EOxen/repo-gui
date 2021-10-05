/**
 * Java 1. Homework 7.
 *
 * @author Elena Oxenhorn
 * @version 04.10.2021
 */
 
import java.util.Scanner;

public class Plate {
    private int food;
    private int foodLimit;
    public Plate(int food, int foodLimit) {
        this.food = food;
        this.foodLimit = foodLimit;
    }

    public boolean decreaseFood(int n) {
        if(n > food) {
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("There are " + food + " meatballs in the plate now.");
    }

    public int addFood() {
        System.out.print("Add up to " + foodLimit + " meatballs to a plate: ");
        int x;
        int foodNew;
        Scanner scanner;
        do{
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
            foodNew = food + x;
            if (foodLimit < foodNew){
                foodNew = food;
                System.out.print("Too much, try again: ");
            } else if (foodNew == food){
                foodNew = food;
                System.out.print("You haven't added food, try again: ");
            } else if (foodNew < food){
                foodNew = food;
                System.out.print("Cats never give away their food! Try again: ");
            } else {
                foodNew = food + x;
            }
        } while ( food >= foodNew);
        return food += x;
    }
}