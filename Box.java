/**
 * Java Core. Homework 3.
 *
 * @author Elena Oxenhorn
 * @version 27.10.2021
 */

import java.util.ArrayList;

public class Box <T extends Fruit, S> {

    ArrayList<T> box;
    S name;

    public Box(S name) {
        box = new ArrayList<>();
        this.name = name;
    }
    
    public S getName(){
        return name;
    }
    
    public void addFruitToBox(T t) {
        box.add(t);
    }
    
    public void shiftSingleItem(Box<T, S> box1) throws BoxFruitException {
        if (isFruitsCompare(box1)) {
            throw new BoxFruitException("Different fruits!");
        }
            for (int i = box.size() - 2; i >= 0; i--) {
                box1.getBox().add(box.get(i));
                box.remove(i);
        }
    }
    
    public boolean compare(Box<?, ?> otherBox) {
        if (this.getWeightOfBox() == otherBox.getWeightOfBox()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public ArrayList<T> getBox() {
        return box;
    }
    
    public double getWeightOfBox() {
        return box.get(0).getWeight() * box.size();
    }
    
    public boolean isFruitsCompare(Box otherBox) {
        return (box.get(0).getClass() != otherBox.getBox().get(0).getClass());
    }
}