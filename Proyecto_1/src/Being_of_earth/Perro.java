package Being_of_earth;
import java.lang.String;

import Principal.LivingBeing;

public class Perro extends LivingBeing {
    private String name;
    private int age;

    private String gender;
    public Perro(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
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
