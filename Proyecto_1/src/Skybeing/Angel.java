package Skybeing;

import Principal.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing{
    private String name;
    private String Tipo_Angel;

    public Angel(String name, String Tipo_Angel){
        this.name = name;
        this.Tipo_Angel = Tipo_Angel;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public java.lang.String getTipo_Angel() {
        return Tipo_Angel;
    }
    public void setTipo_Angel(String Tipo_Angel){
        this.Tipo_Angel = Tipo_Angel;
    }

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
    public void Fly(){
        System.out.println("volando");
    }

    @java.lang.Override
    public void ChangeDimension() {
        System.out.println("Cambiando de dimension");
    }

    @java.lang.Override
    public void invisible() {
        System.out.println("Soy invisible");
    }
}
