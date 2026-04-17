package PracticasGuiadas.practica3.AbstractFactory.Nintendo;

import PracticasGuiadas.practica3.AbstractFactory.Moneda;

public class NintendoDSMoneda extends Moneda{

    public NintendoDSMoneda(int valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "NintendoDSMoneda [" + super.getValor() + "]";
    }    
    
}
