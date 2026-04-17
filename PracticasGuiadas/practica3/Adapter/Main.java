package PracticasGuiadas.practica3.Adapter;

public class Main {
    public static void main(String[] args) {
        TipoA tipoA = new Adapter(new TipoExtranjero());
        tipoA.conectorA();
    }
}
