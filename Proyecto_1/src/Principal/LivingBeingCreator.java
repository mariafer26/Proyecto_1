package Principal;
import java.util.Scanner;
import Being_of_earth.Humanos;

public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeing createLivingBeings() {
        System.out.println("Creando un ser vivo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Crear un humano?");
        String respuesta = scanner.nextLine();

        if(respuesta.equals("si")) {
            System.out.println("Ingrese el nombre del humano:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad del humano:");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el género del humano:");
            String genero = scanner.nextLine();

            Humanos nuevoHumano = new Humanos(nombre, edad, genero);
            scanner.close();

            return nuevoHumano;
        } else {
            // Cerrar el scanner
            scanner.close();
            return null; // Si no se desea crear un humano, retorna null
        }
    }
}