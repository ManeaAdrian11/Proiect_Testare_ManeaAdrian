public class Parola {

    public static void verificaParola(String parola) {
        boolean lungimeOK = parola.length() >= 8;
        boolean contineMajuscula = parola.matches(".*[A-Z].*");
        boolean contineSpecial = parola.matches("!#%@");

        if (!lungimeOK) {
            System.out.println("Parola trebuie să aibă cel puțin 8 caractere.");
        }

        if (!contineMajuscula) {
            System.out.println("Parola trebuie să conțină cel puțin o literă mare.");
        }

        if (!contineSpecial) {
            System.out.println("Parola trebuie să conțină cel puțin un caracter special.");
        }

        if (lungimeOK && contineMajuscula && contineSpecial) {
            System.out.println("Parola este validă!");
        }
    }

    public static void main(String[] args) {

        verificaParola("Parola123!");

    }


}

