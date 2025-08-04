public class Angajat {

    String Nume;
    String functie;
    int salariu;

    public Angajat(String Nume, String functie, int salariu) {

        this.Nume = Nume;
        this.functie = functie;
        this.salariu = salariu;

    }

    public double calculeazabonus() {

        if (functie.equalsIgnoreCase("Manager")) {
            return salariu * 0.10;
        } else {
            return salariu * 0.05;
        }
    }

    public void afiseazasalariutotal() {

        double bonus = calculeazabonus();
        double salariutotal = salariu + bonus;
        System.out.println("Angajat: " + Nume);
        System.out.println("Functie: " + functie);
        System.out.println("Salariu: " + salariu);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salariu Total: " + salariutotal);
    }


    public void main(String[] args) {

        Angajat angajat1 = new Angajat("Mihai Postu", "Manager", 5000);
        Angajat angajat2 = new Angajat("Manea Adrian", "Angajat", 4000);

        angajat1.afiseazasalariutotal();
        System.out.println();
        angajat2.afiseazasalariutotal();


    }

}
