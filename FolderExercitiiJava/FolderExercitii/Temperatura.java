public class Temperatura {


    public static double converteste(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}


 class TestTemperatura {


    public static void main(String[] args) {
        double c = 33.0;
        double f = Temperatura.converteste(c);
        System.out.println(c + " grade Celsius = " + f + " grade Fahrenheit");
    }

}

