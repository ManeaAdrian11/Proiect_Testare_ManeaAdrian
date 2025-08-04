public class Angajat2 {


    public void afiseazaFunctie() {
        System.out.println("Angajat generic");
    }
}


class Programator extends Angajat2 {

    public void afiseazaFunctie() {
        System.out.println("Funcție: Programator");
    }
}


class Tester extends Angajat2 {

    public void afiseazaFunctie() {
        System.out.println("Funcție: Tester");
    }
}


 class TestAngajati {
    public static void main(String[] args) {

        Angajat2[] angajati = new Angajat2[3];

        angajati[0] = new Angajat2();
        angajati[1] = new Programator();
        angajati[2] = new Tester();


        for (int i = 0; i < angajati.length; i++) {
            angajati[i].afiseazaFunctie();
        }
    }
}

