package EarthBeing; //Llamamos el paquete EarthBeing

public abstract class LivingBeing { //Creamos la clase abstracta LivingBeing
    //Creamos los metodos que seran implementados en las clases que hereden de esta clase
    public void born() {
        System.out.println("Born...");
    }
    public void breathe() {
        System.out.println("Breathing...");
    }
    public void grow() {
        System.out.println("Growing...");
    }
    public void reproduce() {
        System.out.println("Reproduce...");
    }
    public void die() {
        System.out.println("Diying...");
    }
}
