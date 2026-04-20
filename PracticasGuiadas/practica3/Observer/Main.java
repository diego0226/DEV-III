package PracticasGuiadas.practica3.Observer;

public class Main {
    public static void main(String[] args) {
        YoutubeSubject youtube = new YoutubeSubject("Eso esooo");
        InstagramSubject insta = new InstagramSubject("Pablogoatxl subio video");

        youtube.addObserver(new YoutubeObserver());
        insta.addObserver(new InstagramObserver());

        youtube.newVideo("TheGrefg subio video");
        insta.newReel("Rafa subio nuevo reel🔥");


    }
    
}
