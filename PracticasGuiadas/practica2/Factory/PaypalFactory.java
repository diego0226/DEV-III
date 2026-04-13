package PracticasGuiadas.practica2.Factory;

public class PaypalFactory  implements Factory{

    @Override
    public Payment createPaymets() {
        return new Paypal(100, false);
    }
    
}
