package Clases.LibreriasEstructuras.Ejercicio;

public class Product implements Comparable <Product>{
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quanity){
        this.name = name;
        this.price = price;
        this.quantity = quanity;
    }

    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product: name: " + name + ", quantity: " + quantity;
    }

    @Override
    public int compareTo(Product otro) {
        return Integer.compare(this.quantity, otro.quantity);
    }
    
}
