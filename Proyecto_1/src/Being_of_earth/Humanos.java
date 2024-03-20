package Being_of_earth;
import Principal.Earthbeing;
import Principal.LivingBeing;
import java.lang.String;

public class Humanos extends LivingBeing {
        private String names;
        private int age;


    public Humanos(String names, int age) {
        this.names = names;
        this.age = age;
    }

    public String getName() {
        return names;
    }
    public void setName(String names) {
        this.names = names;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void born(){
        System.out.println("El humano está naciendo");
    }

    @Override
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

    public void sing(){
            System.out.println("Cantando");
    }
}
