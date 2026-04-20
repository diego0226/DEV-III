package PracticasGuiadas.practica3.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSubject implements Subject{
    private String state;
    private List<Observer> listObservers;

    public YoutubeSubject(String state) {
        this.state = state;
        listObservers = new ArrayList<>();
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

    public void newVideo(String state){
        this.state = state;
        notifyObservers();
    }
    
}
