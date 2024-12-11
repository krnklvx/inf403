package itis403.model;

public class Dog extends Animal {

    protected int paws;
    protected String wool;

    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark() {
        System.out.println("gav gav");
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public String getWool() {
        return wool;
    }

    public Dog(){

    }

    public Dog(String name, int age, int paws, String wool){
        super(name,age);
        this.paws = paws;
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", paws=" + paws +
                ", wool='" + wool + '\'' +
                '}';
    }
}
