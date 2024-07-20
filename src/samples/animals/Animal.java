package samples.animals;

public abstract class Animal {

    //Propoerties
    private String scientificName;
    private String popularName;
    private int age;
    private double mass;

    //Bahaviors
    public abstract void born();

    public abstract void eat();

    public abstract void grows();

    public abstract void reproduces();

    public abstract void die();

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = popularName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}