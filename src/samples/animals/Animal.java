package samples.animals;

public abstract class Animal {

    //Propoerties
    private String scientificName;
    private String popularName;
    private int age;
    private double mass;

    //Constructor
    public Animal() {

    }
    public Animal(String scientificName, String popularName) {
        this.scientificName = scientificName;
        this.popularName = popularName;

    }

    public Animal(String scientificName, String popularName, int age, double mass) {
//        this.scientificName = scientificName;
//        this.popularName = popularName;
//        this.age = age;
//        this.mass = mass;

        //Dessa forma invoca o método acima
        this(scientificName, popularName);
        this.age = age;
        this.mass = mass;
    }

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