package PracticasGuiadas.practica3.Facade;

public class Main {
    public static void main(String[] args) {
        CocinaService cocinaService = new CocinaService();
        FacturaService facturaService = new FacturaService();
        MesaService mesaService = new MesaService();
        NotificacionService notificacionService = new NotificacionService();

        RestaurantFacade restaurantFacade = new RestaurantFacade(cocinaService, facturaService, mesaService, notificacionService);
        restaurantFacade.realizarPedido("Diego", "Hamburguesa");
    }
}
