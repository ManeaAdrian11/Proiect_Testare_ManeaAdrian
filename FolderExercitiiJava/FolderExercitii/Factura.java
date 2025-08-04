import java.time.LocalDateTime;

public class Factura {

    int numarfactura;
    double valuare;
    String data;

    public Factura (){
        numarfactura = 1;
        valuare = 125.3;
        data = "14.7.2025";

    }

    public void afiseazafactura() {

        System.out.println( " Numarul facturi este " + numarfactura + " iar valuarea este " + valuare + " si data facturi este "
        + data);

    }

    public static void main(String[] args) {

        Factura f = new Factura();
        f.afiseazafactura();
    }
}


