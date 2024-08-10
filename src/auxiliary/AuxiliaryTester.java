package auxiliary;

import main.AbstractClass;
import main.Annotation1;
import main.Annotation2;
import main.ConcreteClass;
import main.ConcreteClass1;
import main.ConcreteClass2;
import main.Enumeration;
import main.GenericClass2;
import main.ImutableClass;
import main.Register;
import main.Tools;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.GenericClass1;



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
//        Tools t01 = new Tools();
//        Tools t02 = new Tools();

//        t01.option = 'B';
//        t02.option = 'C';
//
//        System.out.println(t01.option);
//        System.out.println(t02.option);


//        Tools.option = 'C';
//        Tools.option = 'D';
//        Tools.printOption();

        Tools.display("Alguma coisa");
        Tools.display(25.32f);
        double value = Tools.sum(10, 15.976);
        System.out.println(value + 100);

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
        for (int i = 0; i < Enumeration.values().length; i++) {
            System.out.println(Enumeration.values()[i]);


        }

        //Usando o ForEach
        for (Enumeration enumTemp : Enumeration.values()) {
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
        System.out.println("Fim do roteiro 8.");
        System.out.println("------------------------------------");

        System.out.println("Inicio do roteiro 9.");

        List<String> habitat = new ArrayList<>();
//        habitat.add("Florestas Tropicais");
//        habitat.add("Florestas Deciduas");
//        habitat.add("Bosques de Arbustros");
//        habitat.add("Terra Firme");
//        habitat.add("Savanas");

        habitat.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Florestas Deciduas", "Bosques de Arbustros", "Terra Firme", "Savanas", "Oceanos"));

        ImutableClass ic1 = new ImutableClass("Mustela putorius furo", "Furão", 4, 2.5, habitat);
        System.out.println(ic1);

        habitat.clear();
        habitat.add("Oceanos");
        System.out.println(ic1);

        //  System.out.println(ic1.getHABITAT());

        ImutableClass ic2 = new ImutableClass("Galeocerdo Couvier", "Tubarão Tigre", 20, 250.0, habitat);
        System.out.println(ic2);

        System.out.println("Fim do roteiro 9.");
        System.out.println("------------------------------------");

        System.out.println("Inicio do roteiro 10.");

        List<String> habitat2 = new ArrayList<>();
        habitat2.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Florestas Deciduas", "Bosques de Arbustros", "Terra Firme", "Savanas", "Oceanos"));

        Register reg1 = new Register("Mustela putorius furo", "Furão", 4, 2.5, habitat);
        System.out.println(reg1);

        System.out.println("Fim do roteiro 10.");
        System.out.println("------------------------------------");


        System.out.println("Inicio do roteiro 11.");

//        GenericClass1 gc1= new GenericClass1();
//        System.out.println(gc1.getPassword());
//        gc1.setPassword(6666);
//        Object password = gc1.getPassword();
//        password = (int)password + 1111;
//        System.out.println(password);
//        gc1.setPassword("senha");
//        System.out.println(gc1.getPassword());


        GenericClass1<String> gc1 = new GenericClass1<>();
        gc1.setPassword("senha");
        System.out.println(gc1.getPassword());

        GenericClass1<Integer> gc2 = new GenericClass1<>();
        gc2.setPassword(1234);
        System.out.println(gc2.getPassword());

        GenericClass2<Integer, String> gc3 = new GenericClass2<>();
        gc3.setPassword(1234);
        gc3.setDescription("Senha");

        System.out.println(gc3.getDescription());
        System.out.println(gc3.getPassword());

        System.out.println("Fim do roteiro 11.");
        System.out.println("------------------------------------");

        System.out.println("Inicio do roteiro 12.");

        Character char1 = 'A';
        Tools.display(char1);

        Method[] methods = Tools.class.getDeclaredMethods();
        for (Method temp : methods) {
            if (temp.isAnnotationPresent(Annotation1.class)){
                Annotation1 a1 = temp.getAnnotation(Annotation1.class);
                System.out.println("Método anotado: " + temp.getName());
                System.out.println("Conteudo da anotação: " + a1.value());
            }
            if (temp.isAnnotationPresent(Annotation2.class)) {
                System.out.println("Olá sou Annotation 2 e passei por aqui tbm");
            }
        }


    }

}