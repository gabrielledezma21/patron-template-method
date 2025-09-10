package ar.edu.unahur.obj2.infusiones;

public class TeVerde extends Te {
    
    @Override
    protected String doPreparar() {
        return "Elegir el saquito de té verde. \n" + super.doPreparar();
    }

}
