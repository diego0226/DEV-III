package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio2;

import java.sql.Date;

public class Comida {
    private String name;
    private Date fechaVencimiento;
    private int quantity;

    public Comida(String name, Date fechaVencimiento, int quantity) {
        this.name = name;
        this.fechaVencimiento = fechaVencimiento;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Comida [name=" + name + ", fechaVencimiento=" + fechaVencimiento + ", quantity=" + quantity + "]";
    }
}
