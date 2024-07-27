package main;

public interface Interface1 {

    boolean INTERFACE_VAR = true;

    default void interfaceMethod1(){

        System.out.println("Método 1 da interface 1");
    }

    void interfaceMethod2();

}
