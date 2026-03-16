import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        //list.add(10);

        String text = (String) list.get(0);
        System.out.println(text);

        Caja<String> cajaTexto = new Caja<>();
        Caja<Double> cajaDecimal = new Caja<>();
        cajaTexto.setValor("String");
        cajaDecimal.setValor(0.0);

        System.out.println(cajaTexto.getValor());
        System.out.println(cajaDecimal.getValor());
    }


    public static void imprimirLista(List<?> lista){
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
