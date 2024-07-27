package samples.animals;

public class AnimalTester implements Aquatic{

    public static void main(String[] args) {

//        System.out.println("Inicio do roteiro 3.");
//        Shark shark = new Shark();
//
//        shark.setScientificName("Galeocerdo cuvier");
//        shark.setPopularName("Tubarão Tigre");
//        shark.setAge(20);
//        shark.setMass(250.0);
//        shark.setNumberOfFins(2);

        Shark shark = new Shark("Galeocerdo cuvier","Tubarão Tigre",20,250.0,2);

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
        shark.swin();



        System.out.println("Fim do roteiro 3.");
    }

    @Override
    public void swin() {

    }
}
