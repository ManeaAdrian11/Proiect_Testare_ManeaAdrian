public class Contor {

    static int totalObiecte = 0;

    public Contor () {

        totalObiecte++;
    }

    public static void afiseazatotal () {

        System.out.println("obiecte create: "+ totalObiecte);
    }

    public static void main(String[] args) {

        Contor c1 = new Contor();
        Contor c2 = new Contor();
        Contor c3 = new Contor();

        Contor.afiseazatotal();
    }


}
