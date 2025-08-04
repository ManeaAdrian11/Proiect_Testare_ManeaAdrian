public class ContBancar {

    private double sold;
    double cash;


   void depunere(  double sold , double cash){

       System.out.println("Suma depusa este:  " + cash + (sold + cash));
   }

   void retragere( double sold , double cash ){

       if ( cash < sold) {
           System.out.println(" Suma retrasa este " + cash + (sold - cash));
       } else  {
           System.out.println(" Suma de retragere depaseste soldul");
       }
   }
    void verificaSold(double sold){

       System.out.println(" Soldul este : " + sold);
    }

    public static void main(String[] args) {

       ContBancar C = new ContBancar();
        C.depunere(2250.5, 235.3);
        C.retragere(2350.3 , 1255555.5);
        C.verificaSold(4500.3);
    }
}


