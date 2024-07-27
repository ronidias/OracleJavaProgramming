package auxiliary;

import main.AbstractClass;
import main.ConcreteClass;
import main.ConcreteClass1;
import main.ConcreteClass2;


public class AuxiliaryTester {

    public static void main(String[] args) {

        System.out.println("Inicio do roteiro 1.");

        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2();

        cc1.setPassword(5555);
        cc2.setPassword(6666);

        System.out.println(cc1.getPassword());
        System.out.println(cc2.getPassword());

        System.out.println("Fim do roteiro 1.");
        System.out.println("----------------------------------");

        System.out.println("Inicio do roteiro 2.");

        AbstractClass ac1 = new ConcreteClass();
        ConcreteClass cc3 = new ConcreteClass();

        System.out.println(ac1.password);
        System.out.println(cc3.password);

        ac1.sayHello();
        cc3.sayHello();

     // ac1.originalSayHello();
        cc3.originalSayHello();

        ac1.syHi();
        cc3.syHi();

        System.out.println("Fim do roteiro 2.");

        System.out.println("Inicio do roteiro 4.");
        System.out.println(ac1.INTERFACE_VAR);
        System.out.println(cc3.INTERFACE_VAR);

        AuxiliaryClass aux = new AuxiliaryClass();
        //aux.INTERFACE_VAR = false;
        System.out.println(aux.INTERFACE_VAR);
        aux.interfaceMethod1();
        aux.interfaceMethod2();

    }
}