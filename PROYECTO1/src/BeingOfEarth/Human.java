package BeingOfEarth; //Llamamos el paquete BeingOfEarth

import EarthBeing.EarthBeing;   //Importamos la interfaz EarthBeing del paquete EarthBeing
import EarthBeing.LivingBeing;  //Importamos la clase LivingBeing abstracta del paquete EarthBeing

public class Human extends LivingBeing implements EarthBeing {  //Creamos la clase Human que extiende de la clase abstracta LivingBeing e implementa la interfaz EarthBeing

    private String name;    //Declaramos el atributo name de tipo String
    private int age;    //Declaramos el atributo age de tipo int

    public Human(String name, int age) {    //Creamos el constructor de la clase Human con los atributos name y age
        this.name = name;
        this.age = age;
    }

    //Getters y Setters de los atributos name y age
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
    //Métodos de la interfaz EarthBeing
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
    //Creamos el metodo toString de la clase Human que muestra los atributos de la clase Human
    @Override
    public String toString() {
        return "Human" +
                "Name=" + name + '\'' +
                ", age=" + age ;
    }
}
