package PracticasGuiadas.practica3.Adapter;

public class Adapter implements TipoA{
    private TipoExtranjero extranjero;

    public Adapter(TipoExtranjero extranjero) {
        this.extranjero = extranjero;
    }

    @Override
    public void conectorA() {
        extranjero.info();
    }
}
