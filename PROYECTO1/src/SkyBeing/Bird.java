package SkyBeing;   // Llamamos el paquete SkyBeing
import EarthBeing.LivingBeing; //Llamamos el paquete EarthBeing y la clase abstracta LivingBeing

public class Bird extends LivingBeing implements SkyBeing{ //Creamos la clase Bird que extiende de la clase abstracta LivingBeing e implementa la interfaz SkyBeing
    //Creamos los atributos de la clase Bird
    private String name;
    private String color;
    private int age;
    //Creamos los constructores de la clase Bird
    public Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Bird(String name, int age) {
        super();
    }
    //Creamos los metodos get y set de la clase Bird
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
    //Creamos los metodos de la interfaz SkyBeing
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
    public void die(){
        System.out.println("The bird is dying");
    }
    //Creamos el metodo toString de la clase Bird que muestra los atributos de la clase Bird
    @Override
    public String toString() {
        return "Bird" +
                "Name='" + name + '\'' +
                ", color=" + color +
                ", age=" + age ;
    }
}
