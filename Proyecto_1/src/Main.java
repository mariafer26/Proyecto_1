import Being_of_earth.Humanos;
import Being_of_earth.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Humanos mafe = new Humanos();
        mafe.born();
        mafe.die();
        mafe.grow();
        Perro princesa = new Perro( "prin", 3);
        princesa.reproduce();
        princesa.born();
        //System.out.println("the name is:"+ name);
    }
}