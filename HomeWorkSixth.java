/**
 * Java 1. Homework 6.
 *
 * @author Elena Oxenhorn
 * @version 30.09.2021
 */

class HomeWorkSixth {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);
        Animal[] animals = {cat, dog};
        for (AnAnimal animal : animals) {
            System.out.println();
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.swim(10));
            System.out.println(animal.run(220));
            System.out.println(animal.swim(14));
            System.out.println(animal.run(600));
        }
    }
}

abstract class Animal implements AnAnimal{
    protected String className;
    protected int runLimit;
    protected int swimLimit;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    public String run(int distance) {
        if (distance > runLimit) {
            return className + " couldn't run " + distance + " meters";
        } else {
            return className + " ran " + distance + " meters";
        }
    }

    @Override
    public String toString() {
        return className + ": Run limit " + runLimit + " meters, Swim limit " + swimLimit + " meters";
    }

    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " couldn't swim " + distance + " meters";
        } else {
            return className + " swam " + distance + " meters";
        }
    }
}

interface AnAnimal {
    String run(int distance);
    String swim(int distance);
}

class Cat extends Animal {
    Cat (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " can not swim";
    }
}

class Dog extends Animal {
    Dog (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}
