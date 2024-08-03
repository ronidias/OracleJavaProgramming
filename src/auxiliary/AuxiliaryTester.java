package auxiliary;

import main.*;
import main.Enumeration;

import java.util.Arrays;


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

        System.out.println("Fim do roteiro 4.");
        System.out.println("----------------------------------------");

        System.out.println("Inicio do roteiro 6.");

//        //Não precisa instanciar o objeto, pq ele está como Static, da para chamar direto
//
////        Tools t01 = new Tools();
////        Tools t02 = new Tools();
//
////        t01.option = 'B';
////        t02.option = 'C';
////
////        System.out.println(t01.option);
////        System.out.println(t02.option);
//
//
//        Tools.option = 'C';
//        Tools.option = 'D';
//        Tools.printOption();

    Tools.display("Alguma coisa");
    Tools.display(25.32f);
    double value = Tools.sum(10,15.976);
    System.out.println(value+100);

    System.out.println("Fim do roteiro 6.");
    System.out.println("---------------------------------");

    System.out.println("Inicio do roteiro 7.");


    ConcreteClass2 cc4 = new ConcreteClass2(7890);
    ConcreteClass cc5 = new ConcreteClass(7890);
    AbstractClass cc6 = new ConcreteClass(7890);

        System.out.println("Fim do roteiro 7.");
        System.out.println("------------------------------------");

        System.out.println("Inicio do roteiro 8.");

 //       Objeto de Enumeração só pode ser instanciado na propria classe
 //       Enumeration test = Enumeration();

     Enumeration test = Enumeration.ENUM_OBJECT_1;
     System.out.println(test);
     System.out.println(Enumeration.ENUM_OBJECT_2);
     //Enumeration.ENUM_OBJECT_1.value1 = 100;
     //System.out.println(test.value1);
        System.out.println(Enumeration.ENUM_OBJECT_1);
        System.out.println(Enumeration.ENUM_OBJECT_1.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_1.getValue2());
        System.out.println(Enumeration.ENUM_OBJECT_2);
        System.out.println(Enumeration.ENUM_OBJECT_2.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_2.getValue2());
        System.out.println(Enumeration.ENUM_OBJECT_3);
        System.out.println(Enumeration.ENUM_OBJECT_3.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_3.getValue2());

        //Usando o For
        for(int i = 0; i < Enumeration.values().length; i ++){
            System.out.println(Enumeration.values()[i]);


        }

        //Usando o ForEach
        for(Enumeration enumTemp : Enumeration.values()) {
            System.out.println(enumTemp);
            System.out.println(enumTemp.getValue1());
            System.out.println(enumTemp.getValue2());
        }

        //Usando Stream
//        Arrays.stream(Enumeration.values())
//                .forEach( e -> {
//                System.out.println("EnumObject: " + e.name());
//                Arrays.stream(e.ge)
//                });
//

    }


}