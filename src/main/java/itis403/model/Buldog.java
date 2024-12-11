package itis403.model;

public class Buldog extends Dog {
    public void drool() {
        System.out.println("Buldog is drooling");
    }

    public Buldog() {
    }

    public Buldog(String name, int age, int paws, String wool) {
        super(name, age, paws, wool);
    }
}
