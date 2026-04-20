package PracticasGuiadas.practica3.Observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramSubject implements Subject{
    private String state;
    private List<Observer> listObservers;

    

    public InstagramSubject(String state) {
        this.state = state;
        this.listObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer != null) {
            listObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        listObservers.forEach(a -> a.update(state));
    }

    public void newReel(String state){
        this.state = state;
        notifyObservers();
    }
    
}
