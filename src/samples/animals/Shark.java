package samples.animals;

public class Shark extends Fish {

    //Properties
    private int numberOfFins;


    //Behaviors
    @Override
    public void born() {
        System.out.println("Tubarão nascendo");
    }

    @Override
    public void eat() {
        System.out.println("Tubarão comendo");
    }

    @Override
    public void grows() {
        System.out.println("Tubarão crescendo");
    }

    @Override
    public void reproduces() {
        System.out.println("Tubarão reproduzindo");
    }

    @Override
    public void die() {
        System.out.println("Tubarão morrendo");
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }
}
