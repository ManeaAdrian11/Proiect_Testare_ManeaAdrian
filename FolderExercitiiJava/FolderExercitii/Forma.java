public class Forma {

    public double aria() {
        return 0.0;
    }
}


class Cerc extends Forma {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }


    public double aria() {
        return Math.PI * raza * raza;
    }
}


class Dreptunghi extends Forma {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }


    public double aria() {
        return lungime * latime;
    }
}


 class TestForme {
    public static void main(String[] args) {

        Forma[] forme = new Forma[3];

        forme[0] = new Forma();
        forme[1] = new Cerc(6.0);
        forme[2] = new Dreptunghi(7.0, 8.0);

        for (int i = 0; i < forme.length; i++) {
            System.out.println("Aria formei " + (i + 1) + ": " + forme[i].aria());
        }
    }
}

