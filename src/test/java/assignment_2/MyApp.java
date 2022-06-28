package assignment_2;

public class MyApp implements CommonFeatures {

    public static void main (String[] args)
    {
        Animal a = new Animal();

        a.setNumberOfLegs("4");
        System.out.println(a.getNumberOfLegs());

        a.setWeight("53.22");
        System.out.println(a.getWeight());

        a.setColorOfEyes("black");
        System.out.println(a.getColorOfEyes());

        a.setCanFly("true");
        System.out.println(a.getCanFly());

        Goat g = new Goat();

        g.setCanFly("false");
        System.out.println(g.getCanFly());

        g.setColorOfEyes("orange");
        System.out.println(g.getColorOfEyes());

        g.setWeight("12.93");
        System.out.println(g.getWeight());

        g.setNumberOfLegs("4");
        System.out.println(g.getNumberOfLegs());

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
}
