import BeingOfEarth.Dog;
import BeingOfEarth.Human;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Debug</b> code, press <shortcut actionId="Debug"/> or

public class Main {
    public static void main(String[] args) {
        Human Lina = new Human();
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
    }
}