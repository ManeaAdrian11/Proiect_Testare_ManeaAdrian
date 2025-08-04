public class MediaPozitivelor {

    public static double mediaPozitivelor(int[] valori) {
        int suma = 0;
        int count = 0;

        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > 0) {
                suma += valori[i];
                count++;
            }
        }

        if (count > 0) {
            return (double) suma / count;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, -2, 7, 0, -5, 4};

        double media = mediaPozitivelor(array);
        System.out.println("Media numerelor pozitive este: " + media);
    }
}

