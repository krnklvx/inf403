package itis403;

import itis403.model.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Elephant elephant = new Elephant();
        Buldog buldog = new Buldog();
        Taksa taksa = new Taksa();
        elephant.eat();
        dog.eat();
        cat.eat();
        dog.bark();
        cat.meow();
        elephant.scream();
        taksa.bark();
        taksa.eat();
        buldog.sleep();
        buldog.drool();
        taksa.chewingOnSlippers();
        Animal hl = new Animal("helik",10);
        System.out.println(hl);

        Cat barsik = new Cat("bars", 10, 5, "red");
        System.out.println(barsik);

        Dog cupa = new Dog("Cupik", 2, 8, "curly");
        System.out.println(cupa);

        Elephant brew = new Elephant("Awer", 4, 4,6);
        System.out.println(brew);
    }
}
