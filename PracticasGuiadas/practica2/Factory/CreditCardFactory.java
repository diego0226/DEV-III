package PracticasGuiadas.practica2.Factory;

public class CreditCardFactory implements Factory{

    @Override
    public Payment createPaymets() {
        return new CreditCard(150, true);
    }
    
}
