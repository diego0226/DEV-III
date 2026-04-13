package PracticasGuiadas.practica2.Factory;

public class PaypalFactory  extends Factory{

    public Paypal createPaymets() {
        return new Paypal(100, false);
    }
    
}
