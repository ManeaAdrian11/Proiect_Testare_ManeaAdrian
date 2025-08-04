public class Vehicul {

    protected int vitezaMaxima;


    public Vehicul(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
}


class MasinaAuto extends Vehicul {
    private String marca;


    public MasinaAuto(int vitezaMaxima, String marca) {
        super(vitezaMaxima);
        this.marca = marca;
    }


    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca);
        System.out.println("Viteza maximă: " + vitezaMaxima + " km/h");
    }
}


 class TestVehicul {

    public static void main(String[] args) {
        MasinaAuto m = new MasinaAuto(280, "Opel");
        m.afiseazaDetalii();
    }
}

