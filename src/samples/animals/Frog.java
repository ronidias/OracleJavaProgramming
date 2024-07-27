package samples.animals;

public class Frog extends Amphibian  {


    //Specific Behaviors
    @Override
    public void born() {
        System.out.println("Sapo Nascendo");

    }

    @Override
    public void eat() {
        System.out.println("Sapo Comendo");

    }

    @Override
    public void grows() {
        System.out.println("Sapo Crescendo");

    }

    @Override
    public void reproduces() {
        System.out.println("Sapo Reproduzindo");

    }

    @Override
    public void die() {
        System.out.println("Sapo Morrendo");
    }

    @Override
    public void swin() {
        System.out.println("Sapo Nadando");

    }

    @Override
    public void Walk() {
        System.out.println("Sapo Andando");
    }
}
