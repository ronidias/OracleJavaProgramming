package samples.animals;

public class Cow extends Mammal implements Terrestrial{
    @Override
    public void born() {
        System.out.println("Vaca Nascendo");

    }

    @Override
    public void eat() {
        System.out.println("Vaca Comendo");

    }

    @Override
    public void grows() {
        System.out.println("Vaca Crescendo");

    }

    @Override
    public void reproduces() {
        System.out.println("Vaca Reproduzindo");

    }

    @Override
    public void die() {
        System.out.println("Vaca Morrendo");

    }

    @Override
    public void Walk() {

    }
}
