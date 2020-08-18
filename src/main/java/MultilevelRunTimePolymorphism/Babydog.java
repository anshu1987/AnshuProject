package MultilevelRunTimePolymorphism;

public class Babydog extends dog {

    public static void main(String args[]) {
        Animal a, a1, a2;
        a = new Babydog();
        a.Animal();
        a1 = new dog();
        a1.Animal();
        new Animal();
    }

    protected void Animal() {
        System.out.println("Babydog drinks milk");
    }


}

