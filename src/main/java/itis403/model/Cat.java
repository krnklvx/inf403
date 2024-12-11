package itis403.model;

public class Cat extends Animal {
    protected int tail;
    protected String colour;

    public void eat() {
        System.out.println("Cat is eating");
    }
    public void meow() {
        System.out.println("meow meow");
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public Cat() {

    }

    public Cat(String name, int age, int tail, String colour) {
        super(name,age);
        this.tail = tail;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "tail=" + tail +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
