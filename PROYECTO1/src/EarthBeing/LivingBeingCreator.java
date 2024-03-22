package EarthBeing;

import BeingOfEarth.Dog;
import BeingOfEarth.Human;
import EarthBeing.Creator;
import EarthBeing.LivingBeing;
import SkyBeing.Bird;

import javax.swing.*;

public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeing createLivingBeings() {
        return null;
    }

    public LivingBeing createLivingBeings(String type, String name, int age, String color) {
        if ("Human".equalsIgnoreCase(type)) {
            return new Human(name, age);
        } else if ("Animal".equalsIgnoreCase(type)) {
            return new Dog(name, age);
        } else if ("Bird".equalsIgnoreCase(type)) {
            return new Bird(name, color, age);
        } else {
            // Manejar otros tipos o lanzar una excepción si no se reconoce el tipo
            throw new IllegalArgumentException("Tipo de ser vivo no válido: " + type);
        }
    }
}

