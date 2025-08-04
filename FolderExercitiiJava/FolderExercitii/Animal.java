public class Animal {

    public void facesunet(){

        System.out.println("animalul face un sunet");
    }
}

 class Caine extends Animal{

    public void facesunet(){

        System.out.println("Cainele latra");
    }

}

class Pisica extends Animal{

    public void facesunet(){

        System.out.println("Pisica miauna");
    }

}
class ToateAnimalele {

    public static void main(String[] args) {

        Animal[] animale = new Animal[3];

        animale[0] = new Animal();
        animale[1] = new Caine();
        animale[2] = new Pisica();

        for (int i = 0; i < animale.length; i++) {
            animale[i].facesunet();
        }


    }
}
