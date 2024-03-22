package SkyBeing;
import EarthBeing.LivingBeing;

public class Bird extends LivingBeing implements SkyBeing{

    private String name;
    private String color;
    private int age;

    public Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Bird(String name, int age) {
        super();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fly() {
        System.out.println("I'm flying");
    }
    public void changedimension() {
        System.out.println("I'm changing dimension");
    }
    public void born(){
        System.out.println("The bird is born");
    }
    public void breathe(){
        System.out.println("The bird is breathing");
    }
    @Override
    public String toString() {
        return "Bird" +
                "Name='" + name + '\'' +
                ", color=" + color +
                ", age=" + age ;
    }
}
