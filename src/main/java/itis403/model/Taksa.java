package itis403.model;

public class Taksa extends Dog {
    public void chewingOnSlippers(){
        System.out.println("Taksa is chewing on slippers");
    }

    public Taksa() {

    }

    public Taksa(String name, int age, int paws, String wool) {
        super(name, age, paws, wool);
    }
}
