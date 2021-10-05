/**
 * Java 1. Homework 7.
 *
 * @author Elena Oxenhorn
 * @version 04.10.2021
 */
 
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private static int   fedCat = 0;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        satiety = satiety;
    }

    public void eat(Plate p) {
        if (satiety != true) {
            satiety = p.decreaseFood(appetite);
            if (satiety == true) {
                fedCat++;
            }
        }
    }

    public int getFedCat() {
        return fedCat;
    }

    public String getSatietySting() {
        if (satiety != true) {
            return "hungry";
        } else {
            return "full";
        }
    }

    @Override
    public String toString() {
        return "Cat " + name + " eats " + appetite + " meatballs. The cat is " + getSatietySting();
    }
}