package samples.animals;

public abstract class Amphibian extends Chordate implements Terrestrial, Aquatic{

    //Constructor
    public Amphibian(){

    }
    public Amphibian(String scientificName, String popularName, int age, double mass) {
        super(scientificName,popularName,age,mass);

    }
}
