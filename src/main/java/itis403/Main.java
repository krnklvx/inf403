package itis403;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Leopard leo = new Leopard();
        Buldog buldog = new Buldog();
        Taksa taksa = new Taksa();
        leo.eat();
        dog.eat();
        cat.eat();
        dog.bark();
        cat.meow();
        leo.growl();
        taksa.bark();
        taksa.eat();
        buldog.sleep();
        buldog.drool();

    }
}
