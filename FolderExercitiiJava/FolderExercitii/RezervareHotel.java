public class RezervareHotel{

    private String NumeClient;
    private String TipCamera;


    public RezervareHotel(String NumeClient){

        this.NumeClient = NumeClient;
        this.TipCamera = "Normala";
        afiseazadetalii();
    }

    public RezervareHotel(String NumeClient,String TipCamera){

        this.NumeClient = NumeClient;
        this.TipCamera = TipCamera;
        afiseazadetalii();

    }

    public void afiseazadetalii(){

        System.out.println("Rezervare Hotel: ");
        System.out.println("Client: " + NumeClient);
        System.out.println("Tipul Camerei: " + TipCamera);
        System.out.println();

    }

    public static void main(String[] args) {

        RezervareHotel rezervare1 = new RezervareHotel("SefuCalu");
        RezervareHotel rezervare2 = new RezervareHotel("Adrian","Premium");

    }
    }

