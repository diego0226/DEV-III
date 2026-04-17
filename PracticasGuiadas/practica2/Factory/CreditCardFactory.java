package PracticasGuiadas.practica2.Factory;

public class CreditCardFactory implements Factory{

    public CreditCard createPaymets() {
        return new CreditCard(150, true);
    }
    
}
