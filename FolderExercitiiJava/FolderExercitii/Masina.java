public class Masina {
    String marca;
    int an;

    public Masina() {
        marca = "skoda";
        an = 2015;
    }

    public void afiseazadate() {
        System.out.println("Marca este " + marca + " si anul de fabricatie este " + an);
    }


    public static void main(String[] args) {
        Masina m = new Masina();
        m.afiseazadate();
    }
}


