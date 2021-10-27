/**
 * Java Core. Homework 3.
 *
 * @author Elena Oxenhorn
 * @version 27.10.2021
 */

public class WareHouse {
    public static void main(String[] args) {
        Box<Apple, String> box = new Box("#1_apples");
        Box<Apple, String> box1 = new Box("#2_apples");
        Box<Orange, String> box2 = new Box("#1_oranges");
        
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Orange orange8 = new Orange();
        Orange orange9 = new Orange();
        Orange orange10 = new Orange();
        
        box.addFruitToBox(apple1);
        box.addFruitToBox(apple2);
        box.addFruitToBox(apple3);
        box.addFruitToBox(apple4);
        box.addFruitToBox(apple5);
        
        box1.addFruitToBox(apple6);
        box1.addFruitToBox(apple7);
        box1.addFruitToBox(apple8);
        box1.addFruitToBox(apple9);
        box1.addFruitToBox(apple10);
        
        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);
        box2.addFruitToBox(orange3);
        box2.addFruitToBox(orange4);
        box2.addFruitToBox(orange5);
        box2.addFruitToBox(orange6);
        box2.addFruitToBox(orange7);
        box2.addFruitToBox(orange8);
        box2.addFruitToBox(orange9);
        box2.addFruitToBox(orange10);
        
        System.out.print("Box " + box.getName() + " weighs ");
        System.out.println(box.getWeightOfBox());
        System.out.print("Box " + box1.getName() + " weighs ");
        System.out.println(box1.getWeightOfBox());
        System.out.print("Box " + box2.getName() + " weighs ");
        System.out.println(box2.getWeightOfBox());
        
        System.out.println("The weight of boxes " + box.getName() + " and " + box1.getName() + " is the " + (box.compare(box1)? "same" : "different"));
        System.out.println("The weight of boxes " + box.getName() + " and " + box2.getName() + " is the " + (box.compare(box2)? "same" : "different"));
        System.out.println();
        try {
            System.out.println("Pour all but one fruit from box " + box.getName() + " into box " + box1.getName());
            box.shiftSingleItem(box1);
        }
        catch (BoxFruitException e) {
            e.printStackTrace();
        }
 
        System.out.print("Box " + box.getName() + " weighs ");
        System.out.println(box.getWeightOfBox());
        System.out.print("Box " + box1.getName() + " weighs ");
        System.out.println(box1.getWeightOfBox());
        System.out.print("Box " + box2.getName() + " weighs ");
        System.out.println(box2.getWeightOfBox());
    }
}