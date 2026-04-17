package PracticasGuiadas.practica3.AbstractFactory.Fabricas;

import PracticasGuiadas.practica3.AbstractFactory.Nintendo.NintendoDSBloqueInterrogante;
import PracticasGuiadas.practica3.AbstractFactory.Nintendo.NintendoDSMoneda;

public class NintendoDSItemFactory implements AbstractFactory{

    @Override
    public NintendoDSMoneda createMoneda(int valor) {
        return new NintendoDSMoneda(valor);
    }

    @Override
    public NintendoDSBloqueInterrogante createBloqueInterrogante(String valor) {
        return new NintendoDSBloqueInterrogante(valor);
    }

}
