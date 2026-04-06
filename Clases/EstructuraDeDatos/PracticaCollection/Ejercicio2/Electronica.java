package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio2;

public class Electronica {
    private String name;
    private String marca;
    private int price;

    public Electronica(String name, String marca, int price) {
        this.name = name;
        this.marca = marca;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Electronica [name=" + name + ", marca=" + marca + ", price=" + price + "]";
    } 
}
