
import java.util.ArrayList;
import java.util.List;

public class Traveseo  {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        Integer a = 2;
        Number b = 4;
        String c = "hola";

        list.add(b);

        //list.add(c);
    }
    

    
}
