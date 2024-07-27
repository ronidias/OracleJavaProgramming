package main;

public abstract class AbstractClass implements Interface1, Interface2 {

   //Properties
   public int password;

   //Constructors
   public AbstractClass(){

      password = 9999;
   }
   public AbstractClass(int password){
      this.password = password;
   }

   //Behaviors
   public void sayHello(){
      System.out.println("Olá");
   }
   public abstract void syHi();

   @Override
   public void interfaceMethod2() {

   }
}
