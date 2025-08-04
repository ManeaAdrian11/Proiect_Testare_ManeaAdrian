public class Client {

    private String nume;


    public Client(String nume) {
        this.nume = nume;
    }


    public String mesaj() {
        return "Bun venit, " + nume + "!";
    }
}


 class TestClient {

    public static void main(String[] args) {
        Client client1 = new Client("Mihai");
        System.out.println(client1.mesaj());
    }
}

