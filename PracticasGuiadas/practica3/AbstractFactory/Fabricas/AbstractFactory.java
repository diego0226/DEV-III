package PracticasGuiadas.practica3.AbstractFactory.Fabricas;

import PracticasGuiadas.practica3.AbstractFactory.BloqueInterrogante;
import PracticasGuiadas.practica3.AbstractFactory.Moneda;

public interface AbstractFactory {
    Moneda createMoneda(int valor);
    BloqueInterrogante createBloqueInterrogante(String valor);

}
