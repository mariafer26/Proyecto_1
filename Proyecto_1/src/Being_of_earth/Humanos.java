package Being_of_earth;
import Principal.LivingBeing;
public class Humanos extends LivingBeing {
        private String name;
        private int age;


        public void born(){
        System.out.println("El humano está naciendo");
    }

    @Override
    public void die() {
        System.out.println("murio");
    }

    @Override
    public void grow() {
        System.out.println("crece");
    }

    @Override
    public void reproduce() {
        System.out.println("sexx");
    }
}
