package PracticasGuiadas.practica3.Facade;

public class RestaurantFacade {
    private CocinaService cocinaService;
    private FacturaService facturaService;
    private MesaService mesaService;
    private NotificacionService notificacionService;


    public RestaurantFacade(CocinaService cocinaService, FacturaService facturaService, MesaService mesaService,
            NotificacionService notificacionService) {
        this.cocinaService = cocinaService;
        this.facturaService = facturaService;
        this.mesaService = mesaService;
        this.notificacionService = notificacionService;
    }

    public void realizarPedido(String cliente, String platillo){
        System.out.println("Listo el pedido");
        mesaService.verificarMesaDisponible();
        cocinaService.registrarOrden(platillo);
        facturaService.generarFactura(cliente, platillo);
        notificacionService.enviarNotificacion(cliente);
    }

    
    
}
