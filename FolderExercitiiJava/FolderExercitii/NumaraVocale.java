public class NumaraVocale {

    public static int numaraVocale(String text) {
        int contor = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contor++;
            }
        }

        return contor;
    }

    public static void main(String[] args) {

        String exemplu = "Ana are multe mere";
        int numarVocale = numaraVocale(exemplu);

        System.out.println("Numărul de vocale: " + numarVocale);
    }
}
