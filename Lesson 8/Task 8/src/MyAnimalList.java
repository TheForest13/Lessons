public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
            nextIndex++;
        }
    }
}
class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Wolf w = new Wolf();
        list.add(a);
        list.add(c);

        a.kuku();

        Dog s = new Dog();
        Object o = s;

        System.out.println(o.getClass());




        w.kuku();

        a.beFriendly();

        Doggi dd = new HomeDog();
        dd.rock();
        dd.goToHome();


    }

}

abstract class Animal {
    abstract void kuku();
}

abstract class Canine  extends Animal {


}

interface Pet {
    int rk = 0;
    void beFriendly();
    void rock();
}

interface Pet2{
    void goToHome();
    void rock();
}

abstract class Doggi implements Pet, Pet2 {

}

class HomeDog extends Doggi {

    @Override
    public void rock() {
        System.out.println("rock in two class");
    }

    public void goToHome(){
        System.out.println("touch");
    }

    public void beFriendly(){
        System.out.println("rock an roll");
    }
}

class Dog extends Canine implements Pet {
    public void rock(){}

    public void beFriendly(){
        System.out.println("Interface pet is dog");
    }

    void kuku(){
        System.out.println("kuku Dog");
    }
}

class SmallDog extends Dog {

}

class Wolf extends Canine {
    void kuku(){
        System.out.println("kuku Wolf");
    }
}

class Cat extends Animal {
     void kuku() {
         System.out.println("kuku cat");
    }
}
