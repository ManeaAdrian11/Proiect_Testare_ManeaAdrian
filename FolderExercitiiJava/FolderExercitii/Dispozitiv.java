public class Dispozitiv {


    public void porneste() {
        System.out.println("Dispozitivul pornește...");
    }
}


class Laptop extends Dispozitiv {

    public void porneste() {
        System.out.println("Laptopul pornește.");
    }
}


class Telefon extends Dispozitiv {

    public void porneste() {
        System.out.println("Telefonul pornește.");
    }
}


 class TestDispozitive {


    public static void pornesteDispozitiv(Dispozitiv d) {
        d.porneste();
    }

    public static void main(String[] args) {
        Dispozitiv laptop = new Laptop();
        Dispozitiv telefon = new Telefon();

        pornesteDispozitiv(laptop);
        pornesteDispozitiv(telefon);
    }
}

