package FolderExercitii;

public class AfisareNumere {

    public static void afiseazaNumere() {
        int numar = 1;

        while (numar <= 5) {
            System.out.println("Număr: " + numar);
            numar++;
        }
    }

    public static void main(String[] args) {
        afiseazaNumere();
    }
}

