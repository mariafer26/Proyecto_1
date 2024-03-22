package EarthBeing; //LLamamos el paquete EarthBeing

import BeingOfEarth.Dog; //Importamos la clase Dog del paquete BeingOfEarth
import BeingOfEarth.Human;  //Importamos la clase Human del paquete BeingOfEarth
import EarthBeing.Creator;  //Importamos la interfaz Creator del paquete EarthBeing
import EarthBeing.LivingBeing;  //Importamos la clase LivingBeing   del paquete EarthBeing
import SkyBeing.Bird;   //Importamos la clase Bird del paquete SkyBeing

public class LivingBeingCreator implements Creator { //Creamos la clase LivingBeingCreator que implementa la interfaz Creator
    //Sobreescribimos el metodo createLivingBeings
    @Override
    public LivingBeing createLivingBeings() {
        return null;
    }
    //Creamos el metodo createLivingBeings que recibe como parametros un String type, String name, int age, String color
    public LivingBeing createLivingBeings(String type, String name, int age, String color) {
        if ("Human".equalsIgnoreCase(type)) { //Si el tipo es igual a Human se crea un objeto de tipo Human con los parametros name y age
            return new Human(name, age); //Retornamos un objeto de tipo Human
        } else if ("Animal".equalsIgnoreCase(type)) { //Si el tipo es igual a Animal se crea un objeto de tipo Dog con los parametros name y age
            return new Dog(name, age);  //Retornamos un objeto de tipo Dog
        } else if ("Bird".equalsIgnoreCase(type)) { //Si el tipo es igual a Bird se crea un objeto de tipo Bird con los parametros name, color y age
            return new Bird(name, color, age);  //Retornamos un objeto de tipo Bird
        } else {    //Si no se cumple ninguna de las condiciones anteriores
            throw new IllegalArgumentException("Tipo de ser vivo no válido: " + type);  //Arrrojamos una excepcion
        }
    }
}
