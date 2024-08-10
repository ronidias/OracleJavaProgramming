package main;

import java.sql.SQLOutput;

public class Tools {

    //Properties
    public static char option = 'A';
    public char alternative = 'a';

//    //Behaviors
//    public static void printOption(){
//
//        System.out.println(option);
//}
//
//    public static void printAlternative(){
//        char altern = 'z';
//        System.out.println(altern);
//        printOption();
//    }
//
//    public void printOp(){
//
//        System.out.println(option);
//        printOption();
//    }


    @Annotation1("Método genérico utilizado")
    public static <T> void display(T info){
        System.out.println(info);


    }


    public static void display(double num){
        System.out.println(num);
    }

    public static double sum(double num1, double num2){
        double result = num1 + num2;
        System.out.println(result);
        return result;
    }


}
