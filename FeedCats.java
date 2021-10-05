/**
 * Java 1. Homework 7.
 *
 * @author Elena Oxenhorn
 * @version 04.10.2021
 */
 
public class FeedCats {
    public static void main(String[] args) {
        Plate plate = new Plate(0, 100);
        Cat[] cats = {
            new Cat("Barsik", 50, false),
            new Cat("Murzik", 30, false),
            new Cat("Pushok", 40, false),
        };
        int catFull = 0;
        System.out.println("Feed the cats with meatballs:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        plate.info();
        do {
            plate.addFood();
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println(cat);
                catFull = cat.getFedCat();
            }
            plate.info();
        } while (catFull < 3);
        System.out.println("Thank You! All cats are full!");
    }
}