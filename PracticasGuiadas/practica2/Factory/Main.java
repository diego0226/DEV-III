package PracticasGuiadas.practica2.Factory;

public class Main {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = new CreditCardFactory();
        PaypalFactory paypalFactory =  new PaypalFactory();
        CreditCard creditCard = creditCardFactory.createPaymets();
        System.out.println(creditCard.toString());
        Paypal paypal = paypalFactory.createPaymets();
        System.out.println(paypal.toString());
    }
    
}
