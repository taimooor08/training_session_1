package assignment_2;

public class MyApp implements CommonFeatures {

    public static void main (String[] args)
    {
        Animal a = new Animal();

        a.setNumberOfLegs("4");
        System.out.println("Animal have legs: " + a.getNumberOfLegs());

        a.setWeight("53.22");
        System.out.println("Animal have weight: " + a.getWeight());

        a.setColorOfEyes("black");
        System.out.println("Animal have eye color: " + a.getColorOfEyes());

        a.setCanFly("true");
        System.out.println("Can animal fly?: " + a.getCanFly());

        Goat g = new Goat();

        g.setNumberOfLegs("4");
        System.out.println("Goat has legs: " + g.getNumberOfLegs());

        g.setWeight("12.93");
        System.out.println("Goat has weight: " + g.getWeight());

        g.setColorOfEyes("orange");
        System.out.println("Goat has eye color: " + g.getColorOfEyes());

        g.setCanFly("false");
        System.out.println("Can goat fly?: " + g.getCanFly());

        MyApp ma = new MyApp();

        ma.taimoor();
        ma.rahim();
        ma.khan();
        ma.nisum();
    }

    @Override
    public void taimoor() {
        System.out.println("My name is Taimoor.");
    }

    @Override
    public void rahim() {
        System.out.println("My name is Rahim.");
    }

    @Override
    public void khan() {
        System.out.println("My name is Khan.");
    }

    @Override
    public void nisum() {
        System.out.println("My name is Nisum.");
    }

    @Override
    public void faizan() {
        System.out.println("My name is Faizan Muneeb");
    }
}
