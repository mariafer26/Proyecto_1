import Being_of_earth.Humanos;
import Principal.LivingBeingCreator;
import Skybeing.Angel;
import Principal.Creator;
import Principal.LivingBeing;

import java.lang.String;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Humanos mafe = new Humanos("Juan", 30, "mujer");
        mafe.born();
        mafe.die();
        mafe.grow();
        System.out.println("Edad: " + mafe.getAge());
        System.out.println("Nombre: " + mafe.getName());
        System.out.println("Gender: " + mafe.getGender());
        Angel Gabi = new Angel("gabriel", "arcangel");
        Gabi.born();
        System.out.println("nombre: " + Gabi.getName());
        mafe.sing();
        Gabi.Fly();
        Gabi.invisible();
        LivingBeingCreator creator = new LivingBeingCreator();

        // Llamar al método createLivingBeings() para crear un ser vivo
        LivingBeing serVivo = creator.createLivingBeings();

        // Verificar si se creó un ser vivo
        if (serVivo != null) {
            // Si se creó un ser vivo, imprimir información sobre él
            System.out.println("Se ha creado un ser vivo.");
            if (serVivo instanceof Humanos) {
                Humanos humano = (Humanos) serVivo;
                System.out.println("Nombre: " + humano.getName());
                System.out.println("Edad: " + humano.getAge());
                System.out.println("Género: " + humano.getGender());
                humano.sing();
                humano.grow();
            }
        } else {
            // Si no se creó un ser vivo, imprimir un mensaje
            System.out.println("No se ha creado ningún ser vivo.");
        }
    }
}