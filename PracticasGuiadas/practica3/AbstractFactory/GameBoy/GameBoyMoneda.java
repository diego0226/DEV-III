package PracticasGuiadas.practica3.AbstractFactory.GameBoy;

import PracticasGuiadas.practica3.AbstractFactory.Moneda;

public class GameBoyMoneda extends Moneda{

    public GameBoyMoneda(int valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "GameBoyMoneda [" + super.getValor() + "]";
    }    
}
