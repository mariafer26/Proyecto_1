import EarthBeing.LivingBeing; //Importamos la clase LivingBeing del paquete EarthBeing
import EarthBeing.LivingBeingCreator;   //Importamos la clase LivingBeingCreator del paquete EarthBeing

public class Main {
    public static void main(String[] args) {
        /*Human Lina = new Human("Lina", 41);
        Lina.born();
        Lina.breathe();
        Lina.grow();
        Lina.reproduce();
        Lina.die();
        System.out.println(Lina);

        Dog Rocky = new Dog("Rocky", 2);
        Rocky.born();
        Rocky.breathe();
        Rocky.grow();
        Rocky.reproduce();
        Rocky.die();
        Rocky.bark();
        System.out.println(Rocky);

        Bird Piolin = new Bird("Piolin", 2);
        Piolin.born();
        Piolin.breathe();
        Piolin.grow();
        Piolin.reproduce();
        Piolin.die();
        Piolin.fly();
        Piolin.changedimension();
        System.out.println(Piolin);
         */
        //Uso del Método Factory
        LivingBeingCreator factory = new LivingBeingCreator(); //Creamos una instancia de la clase LivingBeingCreator
        LivingBeing human = factory.createLivingBeings("Human", "Alice", 30, "White");  //Creamos una instancia de la clase Human
        LivingBeing animal = factory.createLivingBeings("Animal", "Dog", 5, "Brown");   //Creamos una instancia de la clase Dog
        LivingBeing bird = factory.createLivingBeings("Bird", "Piolin", 2, "Yellow");   //Creamos una instancia de la clase Bird
        //Imprimimos los objetos creados con sus respectivos métodos
        System.out.println(human);
        human.born();
        human.breathe();
        human.grow();
        System.out.println(animal);
        animal.born();
        animal.breathe();
        animal.die();
        System.out.println(bird);
        bird.born();
        bird.breathe();
        bird.die();
    }
}
