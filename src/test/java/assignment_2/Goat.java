package assignment_2;

public class Goat extends Animal {

    private String numberOfLegs;
    private String weight;
    private String colorOfEyes;
    private String canFly;

    public void setNumberOfLegs(String numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public void setCanFly(String canFly) {
        this.canFly = canFly;
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getWeight() {
        return weight;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public String getCanFly() {
        return canFly;
    }
}
