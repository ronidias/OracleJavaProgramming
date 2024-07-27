package samples.animals;

public abstract class Fish extends Chordate implements Aquatic{

    @Override
    public void swin() {
        System.out.println("Fish swins");
    }


}
