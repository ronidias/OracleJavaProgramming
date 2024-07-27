package samples.animals;

public class While extends Mammal implements Aquatic {


    //Specific Behaviors
    @Override
    public void born() {

        System.out.println("Baleia Nascendo");

    }

    @Override
    public void eat() {
        System.out.println("Baleia Comendo");

    }

    @Override
    public void grows() {
        System.out.println("Baleia Crescendo");

    }

    @Override
    public void reproduces() {
        System.out.println("Baleia Reproduzindo");

    }

    @Override
    public void die() {
        System.out.println("Baleia Morrendo");



    }

    @Override
    public void swin() {

    }
}
