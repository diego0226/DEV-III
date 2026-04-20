package PracticasGuiadas.practica3.Observer;

public class InstagramObserver implements Observer{

    @Override
    public void update(String msj) {
        System.out.println(msj);
    }
    
}
