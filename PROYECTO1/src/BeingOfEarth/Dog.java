package BeingOfEarth;

import EarthBeing.LivingBeing;

public class Dog extends LivingBeing{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void born(){
        System.out.println("The dog is born");
    }
    public void breathe(){
        System.out.println("The dog is breathing");
    }
    public void grow(){
        System.out.println("The dog is growing");
    }
    public void reproduce(){
        System.out.println("The dog is reproducing");
    }
    public void die(){
        System.out.println("The dog is dying");
    }
    public void bark(){
        System.out.println("The dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
