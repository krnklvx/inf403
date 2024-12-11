package itis403.model;

public class Elephant extends Animal {

    protected int trunk;
    protected int weight;

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    public void scream() {
        System.out.println("Ruuuu");
    }

    public void setTrunk(int trunk) {
        this.trunk = trunk;
    }

    public int getTrunk() {
        return trunk;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Elephant(){

    }
    public Elephant(String name, int age, int trunk, int weight){
        super(name, age);
        this.trunk = trunk;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", trunk=" + trunk +
                ", weight=" + weight +
                '}';
    }
}
