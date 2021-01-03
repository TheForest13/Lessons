import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public  void go() {
        /*Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);*/

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        takeAnimals(animals);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
    }

    public void takeAnimals(Animal[] animals) {
        for(Animal a: animals){
            a.eat();
        }
    }

    public void takeAnimals(ArrayList<? extends Animal> animals) {
        for (Animal a: animals) {
            a.eat();
        }
    }

    /*public <T extends Animal> void takeAnimals(ArrayList<T> animals) {
        for (Animal a: animals) {
            a.eat();
        }
    }*/
}

abstract class Animal {
    void eat() {
        System.out.println("животное ест");
    }
}

class Dog extends Animal {
    void bark(){ }
}

class Cat<T> extends Animal {
    void meow() {}
}

class Kitty extends Cat {
}
