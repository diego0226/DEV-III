package PracticasGuiadas.practica2.Factory;

public class Paypal implements Payment{
    private int amount;
    private boolean onPay;

    public Paypal(int amount, boolean onPay) {
        this.amount = amount;
        this.onPay = onPay;
    }

    @Override
    public int amount() {
        return amount;
    }

    @Override
    public boolean pay() {
        return onPay;
    }

    @Override
    public String toString() {
        return "Paypal [amount=" + amount + ", onPay=" + onPay + "]";
    }
}
