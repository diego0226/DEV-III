package PracticasGuiadas.practica2.Factory;

public class CreditCardFactory extends Factory{

    public CreditCard createPaymets() {
        return new CreditCard(150, true);
    }
    
}
