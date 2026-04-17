package PracticasGuiadas.practica3.AbstractFactory.Nintendo;

import PracticasGuiadas.practica3.AbstractFactory.BloqueInterrogante;

public class NintendoDSBloqueInterrogante extends BloqueInterrogante{

    public NintendoDSBloqueInterrogante(String valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "NintendoDSBloqueInterrogante [" + super.getValor() + "]";
    }
    
}
