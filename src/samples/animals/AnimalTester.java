package samples.animals;

public class AnimalTester {

    public static void main(String[] args) {

        Shark shark = new Shark();

        shark.setScientificName("Galeocerdo cuvier");
        shark.setPopularName("Tubarão Tigre");
        shark.setAge(20);
        shark.setMass(250.0);
       // shark.setNumberOfFins(2);

        System.out.println(shark.getScientificName());
        System.out.println(shark.getPopularName());
        System.out.println(shark.getAge());
        System.out.println(shark.getMass());
        System.out.println(shark.getNumberOfFins());


        shark.born();
        shark.eat();
        shark.grows();
        shark.reproduces();
        shark.die();
    }
}
