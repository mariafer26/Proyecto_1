package BeingOfEarth;

import EarthBeing.EarthBeing;
import EarthBeing.LivingBeing;

public class Human extends LivingBeing implements EarthBeing {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void born() {
        super.born();
    }

    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void grow() {
        super.grow();
    }

    @Override
    public void reproduce() {
        super.reproduce();
    }

    @Override
    public void die() {
        super.die();
    }

    @Override
    public String toString() {
        return "Human" +
                "Name=" + name + '\'' +
                ", age=" + age ;
    }
}
