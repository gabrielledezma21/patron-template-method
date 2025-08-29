package ar.edu.unahur.obj2.infusiones;

public abstract class Infusion {

    public String preparar(){
        return "Calentar agua. \n" + doPreparar();
    }

    protected abstract String doPreparar();

}
