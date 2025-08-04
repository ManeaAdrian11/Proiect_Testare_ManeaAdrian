public class SumaNumerePare {


    public static void main(String[] args) {
        int[] numere = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                suma = suma + numere[i];
            }
        }

        System.out.println("Suma numerelor pare este: " + suma);
    }

}

