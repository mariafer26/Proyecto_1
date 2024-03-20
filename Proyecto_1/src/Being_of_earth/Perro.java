package Being_of_earth;
import java.lang.String;

import Principal.LivingBeing;

public class Perro extends LivingBeing {
    private String name;
    private int age;

    public Perro(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void born(){
        System.out.println("está naciendo");
    }

    public void die() {
        System.out.println("murio");
    }

    @Override
    public void grow() {
        System.out.println("crece");
    }

    @Override
    public void reproduce() {
        System.out.println("sexx");
    }
}
