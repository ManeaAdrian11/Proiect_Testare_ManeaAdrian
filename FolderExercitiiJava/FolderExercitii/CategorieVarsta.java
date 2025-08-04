public class CategorieVarsta {

    public static String verificaCategorieVarsta(int varsta) {
        if (varsta >= 0 && varsta <= 12) {
            return "Copil";
        } else if (varsta >= 13 && varsta <= 17) {
            return "Adolescent";
        } else if (varsta >= 18 && varsta <= 64) {
            return "Adult";
        } else if (varsta >= 65) {
            return "Senior";
        } else {
            return "Vârstă invalidă";
        }
    }

    public static void main(String[] args) {

        System.out.println("Vârsta 10: " + verificaCategorieVarsta(10));
        System.out.println("Vârsta 15: " + verificaCategorieVarsta(15));
        System.out.println("Vârsta 30: " + verificaCategorieVarsta(30));
        System.out.println("Vârsta 70: " + verificaCategorieVarsta(70));
        System.out.println("Vârsta -3: " + verificaCategorieVarsta(-3));
    }
}





