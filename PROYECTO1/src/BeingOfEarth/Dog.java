package BeingOfEarth; //Llamamos el paquete BeingOfEarth

import EarthBeing.LivingBeing; //Importamos la clase LivingBeing abstracta del paquete EarthBeing

public class Dog extends LivingBeing{ //Creamos la clase Dog que extiende de la clase abstracta LivingBeing
    private String name; //Declaramos el atributo name de tipo String
    private int age; //Declaramos el atributo age de tipo int

    public Dog(String name, int age) {  //Creamos el constructor de la clase Dog con los atributos name y age
        this.name = name;
        this.age = age;
    }

    public Dog() {  //Creamos el constructor de la clase Dog sin atributos
        super();
    }

    //Creamos los métodos get y set para los atributos name y age
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

    //Creamos el metodo toString de la clase Dog que muestra los atributos de la clase Dog
    @Override
    public String toString() {
        return "Dog" +
                "name=" + name + '\'' +
                ", age=" + age ;
    }

}

