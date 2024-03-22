import EarthBeing.LivingBeing;
import EarthBeing.LivingBeingCreator;

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

        LivingBeingCreator factory = new LivingBeingCreator();
        LivingBeing human = factory.createLivingBeings("Human", "Alice", 30, "White");
        LivingBeing animal = factory.createLivingBeings("Animal", "Dog", 5, "Brown");
        LivingBeing bird = factory.createLivingBeings("Bird", "Piolin", 2, "Yellow");

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