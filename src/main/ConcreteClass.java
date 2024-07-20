package main;

public class ConcreteClass extends AbstractClass {

    //Properties
    public int password = 3333;

    //Behaviors
    public void sayHello(){
        System.out.println("E ai, mano?");
    }
    public void originalSayHello(){
        super.sayHello();
    }

    @Override
    public void syHi() {
        System.out.println("oi");

    }
}
